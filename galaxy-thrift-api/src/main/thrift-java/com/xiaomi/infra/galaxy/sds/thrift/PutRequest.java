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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-1-28")
public class PutRequest implements libthrift091.TBase<PutRequest, PutRequest._Fields>, java.io.Serializable, Cloneable, Comparable<PutRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("PutRequest");

  private static final libthrift091.protocol.TField TABLE_NAME_FIELD_DESC = new libthrift091.protocol.TField("tableName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField RECORD_FIELD_DESC = new libthrift091.protocol.TField("record", libthrift091.protocol.TType.MAP, (short)2);
  private static final libthrift091.protocol.TField CONDITION_FIELD_DESC = new libthrift091.protocol.TField("condition", libthrift091.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PutRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PutRequestTupleSchemeFactory());
  }

  public String tableName; // optional
  /**
   * 待写入的记录
   */
  public Map<String,Datum> record; // optional
  /**
   * 仅当满足指定条件时执行写入操作
   */
  public SimpleCondition condition; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    TABLE_NAME((short)1, "tableName"),
    /**
     * 待写入的记录
     */
    RECORD((short)2, "record"),
    /**
     * 仅当满足指定条件时执行写入操作
     */
    CONDITION((short)3, "condition");

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
        case 2: // RECORD
          return RECORD;
        case 3: // CONDITION
          return CONDITION;
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
  private static final _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.RECORD,_Fields.CONDITION};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new libthrift091.meta_data.FieldMetaData("tableName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.RECORD, new libthrift091.meta_data.FieldMetaData("record", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.CONDITION, new libthrift091.meta_data.FieldMetaData("condition", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, SimpleCondition.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(PutRequest.class, metaDataMap);
  }

  public PutRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PutRequest(PutRequest other) {
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetRecord()) {
      this.record = other.record;
    }
    if (other.isSetCondition()) {
      this.condition = new SimpleCondition(other.condition);
    }
  }

  public PutRequest deepCopy() {
    return new PutRequest(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    this.record = null;
    this.condition = null;
  }

  public String getTableName() {
    return this.tableName;
  }

  public PutRequest setTableName(String tableName) {
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

  public int getRecordSize() {
    return (this.record == null) ? 0 : this.record.size();
  }

  public void putToRecord(String key, Datum val) {
    if (this.record == null) {
      this.record = new HashMap<String,Datum>();
    }
    this.record.put(key, val);
  }

  /**
   * 待写入的记录
   */
  public Map<String,Datum> getRecord() {
    return this.record;
  }

  /**
   * 待写入的记录
   */
  public PutRequest setRecord(Map<String,Datum> record) {
    this.record = record;
    return this;
  }

  public void unsetRecord() {
    this.record = null;
  }

  /** Returns true if field record is set (has been assigned a value) and false otherwise */
  public boolean isSetRecord() {
    return this.record != null;
  }

  public void setRecordIsSet(boolean value) {
    if (!value) {
      this.record = null;
    }
  }

  /**
   * 仅当满足指定条件时执行写入操作
   */
  public SimpleCondition getCondition() {
    return this.condition;
  }

  /**
   * 仅当满足指定条件时执行写入操作
   */
  public PutRequest setCondition(SimpleCondition condition) {
    this.condition = condition;
    return this;
  }

  public void unsetCondition() {
    this.condition = null;
  }

  /** Returns true if field condition is set (has been assigned a value) and false otherwise */
  public boolean isSetCondition() {
    return this.condition != null;
  }

  public void setConditionIsSet(boolean value) {
    if (!value) {
      this.condition = null;
    }
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

    case RECORD:
      if (value == null) {
        unsetRecord();
      } else {
        setRecord((Map<String,Datum>)value);
      }
      break;

    case CONDITION:
      if (value == null) {
        unsetCondition();
      } else {
        setCondition((SimpleCondition)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case RECORD:
      return getRecord();

    case CONDITION:
      return getCondition();

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
    case RECORD:
      return isSetRecord();
    case CONDITION:
      return isSetCondition();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PutRequest)
      return this.equals((PutRequest)that);
    return false;
  }

  public boolean equals(PutRequest that) {
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

    boolean this_present_record = true && this.isSetRecord();
    boolean that_present_record = true && that.isSetRecord();
    if (this_present_record || that_present_record) {
      if (!(this_present_record && that_present_record))
        return false;
      if (!this.record.equals(that.record))
        return false;
    }

    boolean this_present_condition = true && this.isSetCondition();
    boolean that_present_condition = true && that.isSetCondition();
    if (this_present_condition || that_present_condition) {
      if (!(this_present_condition && that_present_condition))
        return false;
      if (!this.condition.equals(that.condition))
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

    boolean present_record = true && (isSetRecord());
    list.add(present_record);
    if (present_record)
      list.add(record);

    boolean present_condition = true && (isSetCondition());
    list.add(present_condition);
    if (present_condition)
      list.add(condition);

    return list.hashCode();
  }

  @Override
  public int compareTo(PutRequest other) {
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
    lastComparison = Boolean.valueOf(isSetRecord()).compareTo(other.isSetRecord());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecord()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.record, other.record);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCondition()).compareTo(other.isSetCondition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCondition()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.condition, other.condition);
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
    StringBuilder sb = new StringBuilder("PutRequest(");
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
    if (isSetRecord()) {
      if (!first) sb.append(", ");
      sb.append("record:");
      if (this.record == null) {
        sb.append("null");
      } else {
        sb.append(this.record);
      }
      first = false;
    }
    if (isSetCondition()) {
      if (!first) sb.append(", ");
      sb.append("condition:");
      if (this.condition == null) {
        sb.append("null");
      } else {
        sb.append(this.condition);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
    if (condition != null) {
      condition.validate();
    }
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PutRequestStandardSchemeFactory implements SchemeFactory {
    public PutRequestStandardScheme getScheme() {
      return new PutRequestStandardScheme();
    }
  }

  private static class PutRequestStandardScheme extends StandardScheme<PutRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, PutRequest struct) throws libthrift091.TException {
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
          case 2: // RECORD
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map182 = iprot.readMapBegin();
                struct.record = new HashMap<String,Datum>(2*_map182.size);
                String _key183;
                Datum _val184;
                for (int _i185 = 0; _i185 < _map182.size; ++_i185)
                {
                  _key183 = iprot.readString();
                  _val184 = new Datum();
                  _val184.read(iprot);
                  struct.record.put(_key183, _val184);
                }
                iprot.readMapEnd();
              }
              struct.setRecordIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONDITION
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.condition = new SimpleCondition();
              struct.condition.read(iprot);
              struct.setConditionIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, PutRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.record != null) {
        if (struct.isSetRecord()) {
          oprot.writeFieldBegin(RECORD_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.record.size()));
            for (Map.Entry<String, Datum> _iter186 : struct.record.entrySet())
            {
              oprot.writeString(_iter186.getKey());
              _iter186.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.condition != null) {
        if (struct.isSetCondition()) {
          oprot.writeFieldBegin(CONDITION_FIELD_DESC);
          struct.condition.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PutRequestTupleSchemeFactory implements SchemeFactory {
    public PutRequestTupleScheme getScheme() {
      return new PutRequestTupleScheme();
    }
  }

  private static class PutRequestTupleScheme extends TupleScheme<PutRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, PutRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetRecord()) {
        optionals.set(1);
      }
      if (struct.isSetCondition()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetRecord()) {
        {
          oprot.writeI32(struct.record.size());
          for (Map.Entry<String, Datum> _iter187 : struct.record.entrySet())
          {
            oprot.writeString(_iter187.getKey());
            _iter187.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetCondition()) {
        struct.condition.write(oprot);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, PutRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TMap _map188 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.record = new HashMap<String,Datum>(2*_map188.size);
          String _key189;
          Datum _val190;
          for (int _i191 = 0; _i191 < _map188.size; ++_i191)
          {
            _key189 = iprot.readString();
            _val190 = new Datum();
            _val190.read(iprot);
            struct.record.put(_key189, _val190);
          }
        }
        struct.setRecordIsSet(true);
      }
      if (incoming.get(2)) {
        struct.condition = new SimpleCondition();
        struct.condition.read(iprot);
        struct.setConditionIsSet(true);
      }
    }
  }

}

