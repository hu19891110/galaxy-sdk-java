/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * 增量数据的消费请求
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-1")
public class EditConsumeRequest implements libthrift091.TBase<EditConsumeRequest, EditConsumeRequest._Fields>, java.io.Serializable, Cloneable, Comparable<EditConsumeRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("EditConsumeRequest");

  private static final libthrift091.protocol.TField TABLE_NAME_FIELD_DESC = new libthrift091.protocol.TField("tableName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField PARTITION_ID_FIELD_DESC = new libthrift091.protocol.TField("partitionId", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField SUBSCRIBER_ID_FIELD_DESC = new libthrift091.protocol.TField("subscriberId", libthrift091.protocol.TType.STRING, (short)3);
  private static final libthrift091.protocol.TField CONSUME_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("consumeNumber", libthrift091.protocol.TType.I32, (short)4);
  private static final libthrift091.protocol.TField CONSUME_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("consumeOffset", libthrift091.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EditConsumeRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EditConsumeRequestTupleSchemeFactory());
  }

  /**
   * 表名
   */
  public String tableName; // optional
  /**
   * 表分片ID
   */
  public long partitionId; // optional
  /**
   * 订阅者ID
   */
  public String subscriberId; // optional
  /**
   * 消费数量
   */
  public int consumeNumber; // optional
  /**
   * 消费偏移
   */
  public long consumeOffset; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 表名
     */
    TABLE_NAME((short)1, "tableName"),
    /**
     * 表分片ID
     */
    PARTITION_ID((short)2, "partitionId"),
    /**
     * 订阅者ID
     */
    SUBSCRIBER_ID((short)3, "subscriberId"),
    /**
     * 消费数量
     */
    CONSUME_NUMBER((short)4, "consumeNumber"),
    /**
     * 消费偏移
     */
    CONSUME_OFFSET((short)5, "consumeOffset");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // PARTITION_ID
          return PARTITION_ID;
        case 3: // SUBSCRIBER_ID
          return SUBSCRIBER_ID;
        case 4: // CONSUME_NUMBER
          return CONSUME_NUMBER;
        case 5: // CONSUME_OFFSET
          return CONSUME_OFFSET;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PARTITIONID_ISSET_ID = 0;
  private static final int __CONSUMENUMBER_ISSET_ID = 1;
  private static final int __CONSUMEOFFSET_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.PARTITION_ID,_Fields.SUBSCRIBER_ID,_Fields.CONSUME_NUMBER,_Fields.CONSUME_OFFSET};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new libthrift091.meta_data.FieldMetaData("tableName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITION_ID, new libthrift091.meta_data.FieldMetaData("partitionId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.SUBSCRIBER_ID, new libthrift091.meta_data.FieldMetaData("subscriberId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONSUME_NUMBER, new libthrift091.meta_data.FieldMetaData("consumeNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.CONSUME_OFFSET, new libthrift091.meta_data.FieldMetaData("consumeOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(EditConsumeRequest.class, metaDataMap);
  }

  public EditConsumeRequest() {
    this.consumeOffset = -1L;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EditConsumeRequest(EditConsumeRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    this.partitionId = other.partitionId;
    if (other.isSetSubscriberId()) {
      this.subscriberId = other.subscriberId;
    }
    this.consumeNumber = other.consumeNumber;
    this.consumeOffset = other.consumeOffset;
  }

  public EditConsumeRequest deepCopy() {
    return new EditConsumeRequest(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    setPartitionIdIsSet(false);
    this.partitionId = 0;
    this.subscriberId = null;
    setConsumeNumberIsSet(false);
    this.consumeNumber = 0;
    this.consumeOffset = -1L;

  }

  /**
   * 表名
   */
  public String getTableName() {
    return this.tableName;
  }

  /**
   * 表名
   */
  public EditConsumeRequest setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  /**
   * 表分片ID
   */
  public long getPartitionId() {
    return this.partitionId;
  }

  /**
   * 表分片ID
   */
  public EditConsumeRequest setPartitionId(long partitionId) {
    this.partitionId = partitionId;
    setPartitionIdIsSet(true);
    return this;
  }

  public void unsetPartitionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  /** Returns true if field partitionId is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionId() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  public void setPartitionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTITIONID_ISSET_ID, value);
  }

  /**
   * 订阅者ID
   */
  public String getSubscriberId() {
    return this.subscriberId;
  }

  /**
   * 订阅者ID
   */
  public EditConsumeRequest setSubscriberId(String subscriberId) {
    this.subscriberId = subscriberId;
    return this;
  }

  public void unsetSubscriberId() {
    this.subscriberId = null;
  }

  /** Returns true if field subscriberId is set (has been assigned a value) and false otherwise */
  public boolean isSetSubscriberId() {
    return this.subscriberId != null;
  }

  public void setSubscriberIdIsSet(boolean value) {
    if (!value) {
      this.subscriberId = null;
    }
  }

  /**
   * 消费数量
   */
  public int getConsumeNumber() {
    return this.consumeNumber;
  }

  /**
   * 消费数量
   */
  public EditConsumeRequest setConsumeNumber(int consumeNumber) {
    this.consumeNumber = consumeNumber;
    setConsumeNumberIsSet(true);
    return this;
  }

  public void unsetConsumeNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONSUMENUMBER_ISSET_ID);
  }

  /** Returns true if field consumeNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetConsumeNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __CONSUMENUMBER_ISSET_ID);
  }

  public void setConsumeNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONSUMENUMBER_ISSET_ID, value);
  }

  /**
   * 消费偏移
   */
  public long getConsumeOffset() {
    return this.consumeOffset;
  }

  /**
   * 消费偏移
   */
  public EditConsumeRequest setConsumeOffset(long consumeOffset) {
    this.consumeOffset = consumeOffset;
    setConsumeOffsetIsSet(true);
    return this;
  }

  public void unsetConsumeOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONSUMEOFFSET_ISSET_ID);
  }

  /** Returns true if field consumeOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetConsumeOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __CONSUMEOFFSET_ISSET_ID);
  }

  public void setConsumeOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONSUMEOFFSET_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case PARTITION_ID:
      if (value == null) {
        unsetPartitionId();
      } else {
        setPartitionId((Long)value);
      }
      break;

    case SUBSCRIBER_ID:
      if (value == null) {
        unsetSubscriberId();
      } else {
        setSubscriberId((String)value);
      }
      break;

    case CONSUME_NUMBER:
      if (value == null) {
        unsetConsumeNumber();
      } else {
        setConsumeNumber((Integer)value);
      }
      break;

    case CONSUME_OFFSET:
      if (value == null) {
        unsetConsumeOffset();
      } else {
        setConsumeOffset((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case PARTITION_ID:
      return Long.valueOf(getPartitionId());

    case SUBSCRIBER_ID:
      return getSubscriberId();

    case CONSUME_NUMBER:
      return Integer.valueOf(getConsumeNumber());

    case CONSUME_OFFSET:
      return Long.valueOf(getConsumeOffset());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case PARTITION_ID:
      return isSetPartitionId();
    case SUBSCRIBER_ID:
      return isSetSubscriberId();
    case CONSUME_NUMBER:
      return isSetConsumeNumber();
    case CONSUME_OFFSET:
      return isSetConsumeOffset();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EditConsumeRequest)
      return this.equals((EditConsumeRequest)that);
    return false;
  }

  public boolean equals(EditConsumeRequest that) {
    if (that == null)
      return false;

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_partitionId = true && this.isSetPartitionId();
    boolean that_present_partitionId = true && that.isSetPartitionId();
    if (this_present_partitionId || that_present_partitionId) {
      if (!(this_present_partitionId && that_present_partitionId))
        return false;
      if (this.partitionId != that.partitionId)
        return false;
    }

    boolean this_present_subscriberId = true && this.isSetSubscriberId();
    boolean that_present_subscriberId = true && that.isSetSubscriberId();
    if (this_present_subscriberId || that_present_subscriberId) {
      if (!(this_present_subscriberId && that_present_subscriberId))
        return false;
      if (!this.subscriberId.equals(that.subscriberId))
        return false;
    }

    boolean this_present_consumeNumber = true && this.isSetConsumeNumber();
    boolean that_present_consumeNumber = true && that.isSetConsumeNumber();
    if (this_present_consumeNumber || that_present_consumeNumber) {
      if (!(this_present_consumeNumber && that_present_consumeNumber))
        return false;
      if (this.consumeNumber != that.consumeNumber)
        return false;
    }

    boolean this_present_consumeOffset = true && this.isSetConsumeOffset();
    boolean that_present_consumeOffset = true && that.isSetConsumeOffset();
    if (this_present_consumeOffset || that_present_consumeOffset) {
      if (!(this_present_consumeOffset && that_present_consumeOffset))
        return false;
      if (this.consumeOffset != that.consumeOffset)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tableName = true && (isSetTableName());
    list.add(present_tableName);
    if (present_tableName)
      list.add(tableName);

    boolean present_partitionId = true && (isSetPartitionId());
    list.add(present_partitionId);
    if (present_partitionId)
      list.add(partitionId);

    boolean present_subscriberId = true && (isSetSubscriberId());
    list.add(present_subscriberId);
    if (present_subscriberId)
      list.add(subscriberId);

    boolean present_consumeNumber = true && (isSetConsumeNumber());
    list.add(present_consumeNumber);
    if (present_consumeNumber)
      list.add(consumeNumber);

    boolean present_consumeOffset = true && (isSetConsumeOffset());
    list.add(present_consumeOffset);
    if (present_consumeOffset)
      list.add(consumeOffset);

    return list.hashCode();
  }

  @Override
  public int compareTo(EditConsumeRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionId()).compareTo(other.isSetPartitionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionId, other.partitionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubscriberId()).compareTo(other.isSetSubscriberId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubscriberId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.subscriberId, other.subscriberId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConsumeNumber()).compareTo(other.isSetConsumeNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConsumeNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.consumeNumber, other.consumeNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConsumeOffset()).compareTo(other.isSetConsumeOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConsumeOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.consumeOffset, other.consumeOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("EditConsumeRequest(");
    boolean first = true;

    if (isSetTableName()) {
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
      }
      first = false;
    }
    if (isSetPartitionId()) {
      if (!first) sb.append(", ");
      sb.append("partitionId:");
      sb.append(this.partitionId);
      first = false;
    }
    if (isSetSubscriberId()) {
      if (!first) sb.append(", ");
      sb.append("subscriberId:");
      if (this.subscriberId == null) {
        sb.append("null");
      } else {
        sb.append(this.subscriberId);
      }
      first = false;
    }
    if (isSetConsumeNumber()) {
      if (!first) sb.append(", ");
      sb.append("consumeNumber:");
      sb.append(this.consumeNumber);
      first = false;
    }
    if (isSetConsumeOffset()) {
      if (!first) sb.append(", ");
      sb.append("consumeOffset:");
      sb.append(this.consumeOffset);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EditConsumeRequestStandardSchemeFactory implements SchemeFactory {
    public EditConsumeRequestStandardScheme getScheme() {
      return new EditConsumeRequestStandardScheme();
    }
  }

  private static class EditConsumeRequestStandardScheme extends StandardScheme<EditConsumeRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, EditConsumeRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTITION_ID
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.partitionId = iprot.readI64();
              struct.setPartitionIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SUBSCRIBER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.subscriberId = iprot.readString();
              struct.setSubscriberIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CONSUME_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.consumeNumber = iprot.readI32();
              struct.setConsumeNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CONSUME_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.consumeOffset = iprot.readI64();
              struct.setConsumeOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, EditConsumeRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPartitionId()) {
        oprot.writeFieldBegin(PARTITION_ID_FIELD_DESC);
        oprot.writeI64(struct.partitionId);
        oprot.writeFieldEnd();
      }
      if (struct.subscriberId != null) {
        if (struct.isSetSubscriberId()) {
          oprot.writeFieldBegin(SUBSCRIBER_ID_FIELD_DESC);
          oprot.writeString(struct.subscriberId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetConsumeNumber()) {
        oprot.writeFieldBegin(CONSUME_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.consumeNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetConsumeOffset()) {
        oprot.writeFieldBegin(CONSUME_OFFSET_FIELD_DESC);
        oprot.writeI64(struct.consumeOffset);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EditConsumeRequestTupleSchemeFactory implements SchemeFactory {
    public EditConsumeRequestTupleScheme getScheme() {
      return new EditConsumeRequestTupleScheme();
    }
  }

  private static class EditConsumeRequestTupleScheme extends TupleScheme<EditConsumeRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, EditConsumeRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetPartitionId()) {
        optionals.set(1);
      }
      if (struct.isSetSubscriberId()) {
        optionals.set(2);
      }
      if (struct.isSetConsumeNumber()) {
        optionals.set(3);
      }
      if (struct.isSetConsumeOffset()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetPartitionId()) {
        oprot.writeI64(struct.partitionId);
      }
      if (struct.isSetSubscriberId()) {
        oprot.writeString(struct.subscriberId);
      }
      if (struct.isSetConsumeNumber()) {
        oprot.writeI32(struct.consumeNumber);
      }
      if (struct.isSetConsumeOffset()) {
        oprot.writeI64(struct.consumeOffset);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, EditConsumeRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.partitionId = iprot.readI64();
        struct.setPartitionIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.subscriberId = iprot.readString();
        struct.setSubscriberIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.consumeNumber = iprot.readI32();
        struct.setConsumeNumberIsSet(true);
      }
      if (incoming.get(4)) {
        struct.consumeOffset = iprot.readI64();
        struct.setConsumeOffsetIsSet(true);
      }
    }
  }

}

