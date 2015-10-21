/**
 * Copyright 2015, Xiaomi.
 * All rights reserved.
 * Author: yongxing@xiaomi.com
 */

package com.xiaomi.infra.galaxy.talos.consumer;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import libthrift091.TException;

import com.xiaomi.infra.galaxy.talos.client.Utils;
import com.xiaomi.infra.galaxy.talos.thrift.GetMessageRequest;
import com.xiaomi.infra.galaxy.talos.thrift.GetMessageResponse;
import com.xiaomi.infra.galaxy.talos.thrift.MessageAndOffset;
import com.xiaomi.infra.galaxy.talos.thrift.MessageService;
import com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition;
import com.xiaomi.infra.galaxy.talos.thrift.TopicTalosResourceName;

public class SimpleConsumer {
  private TopicAndPartition topicAndPartition;
  private MessageService.Iface messageClient;
  private TalosConsumerConfig consumerConfig;

  private final AtomicLong requestId = new AtomicLong(1);
  private String simpleConsumerId;

  public SimpleConsumer(TalosConsumerConfig consumerConfig,
      TopicAndPartition topicAndPartition, MessageService.Iface messageClient,
      String consumerIdPrefix) {
    this.consumerConfig = consumerConfig;
    this.topicAndPartition = topicAndPartition;
    this.messageClient = messageClient;
    simpleConsumerId = Utils.generateClientId(consumerIdPrefix);
  }

  public SimpleConsumer(TalosConsumerConfig consumerConfig,
      TopicAndPartition topicAndPartition, MessageService.Iface messageClient) {
    this(consumerConfig, topicAndPartition, messageClient, "");
  }

  public TopicTalosResourceName getTopicTalosResourceName() {
    return topicAndPartition.getTopicTalosResourceName();
  }

  public int getPartitionId() {
    return topicAndPartition.getPartitionId();
  }

  public TopicAndPartition getTopicAndPartition() {
    return topicAndPartition;
  }

  public List<MessageAndOffset> fetchMessage(long startOffset) throws TException {
    return fetchMessage(startOffset, consumerConfig.getMaxFetchRecords());
  }

  public List<MessageAndOffset> fetchMessage(long startOffset,
      int maxFetchedNumber) throws TException {
    String requestSequenceId = Utils.generateRequestSequenceId(
        simpleConsumerId, requestId);
    GetMessageRequest getMessageRequest = new GetMessageRequest(topicAndPartition,
        startOffset, requestSequenceId).setMaxGetMessageNumber(maxFetchedNumber);
    GetMessageResponse getMessageResponse = messageClient.getMessage(getMessageRequest);
    return getMessageResponse.getMessages();
  }
}