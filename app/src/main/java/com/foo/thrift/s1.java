/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.foo.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-11")
public class s1 implements org.apache.thrift.TBase<s1, s1._Fields>, java.io.Serializable, Cloneable, Comparable<s1> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("s1");

  private static final org.apache.thrift.protocol.TField FILED1_FIELD_DESC = new org.apache.thrift.protocol.TField("filed1", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField FILED2_FIELD_DESC = new org.apache.thrift.protocol.TField("filed2", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField FILED3_FIELD_DESC = new org.apache.thrift.protocol.TField("filed3", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField FILED4_FIELD_DESC = new org.apache.thrift.protocol.TField("filed4", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField FILED5_FIELD_DESC = new org.apache.thrift.protocol.TField("filed5", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField FILED6_FIELD_DESC = new org.apache.thrift.protocol.TField("filed6", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField FILED7_FIELD_DESC = new org.apache.thrift.protocol.TField("filed7", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new s1StandardSchemeFactory());
    schemes.put(TupleScheme.class, new s1TupleSchemeFactory());
  }

  public boolean filed1; // required
  public byte filed2; // required
  public short filed3; // required
  public int filed4; // required
  public long filed5; // required
  public double filed6; // required
  public String filed7; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FILED1((short)1, "filed1"),
    FILED2((short)2, "filed2"),
    FILED3((short)3, "filed3"),
    FILED4((short)4, "filed4"),
    FILED5((short)5, "filed5"),
    FILED6((short)6, "filed6"),
    FILED7((short)7, "filed7");

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
        case 1: // FILED1
          return FILED1;
        case 2: // FILED2
          return FILED2;
        case 3: // FILED3
          return FILED3;
        case 4: // FILED4
          return FILED4;
        case 5: // FILED5
          return FILED5;
        case 6: // FILED6
          return FILED6;
        case 7: // FILED7
          return FILED7;
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
  private static final int __FILED1_ISSET_ID = 0;
  private static final int __FILED2_ISSET_ID = 1;
  private static final int __FILED3_ISSET_ID = 2;
  private static final int __FILED4_ISSET_ID = 3;
  private static final int __FILED5_ISSET_ID = 4;
  private static final int __FILED6_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILED1, new org.apache.thrift.meta_data.FieldMetaData("filed1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FILED2, new org.apache.thrift.meta_data.FieldMetaData("filed2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.FILED3, new org.apache.thrift.meta_data.FieldMetaData("filed3", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.FILED4, new org.apache.thrift.meta_data.FieldMetaData("filed4", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FILED5, new org.apache.thrift.meta_data.FieldMetaData("filed5", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.FILED6, new org.apache.thrift.meta_data.FieldMetaData("filed6", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.FILED7, new org.apache.thrift.meta_data.FieldMetaData("filed7", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(s1.class, metaDataMap);
  }

  public s1() {
  }

  public s1(
    boolean filed1,
    byte filed2,
    short filed3,
    int filed4,
    long filed5,
    double filed6,
    String filed7)
  {
    this();
    this.filed1 = filed1;
    setFiled1IsSet(true);
    this.filed2 = filed2;
    setFiled2IsSet(true);
    this.filed3 = filed3;
    setFiled3IsSet(true);
    this.filed4 = filed4;
    setFiled4IsSet(true);
    this.filed5 = filed5;
    setFiled5IsSet(true);
    this.filed6 = filed6;
    setFiled6IsSet(true);
    this.filed7 = filed7;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public s1(s1 other) {
    __isset_bitfield = other.__isset_bitfield;
    this.filed1 = other.filed1;
    this.filed2 = other.filed2;
    this.filed3 = other.filed3;
    this.filed4 = other.filed4;
    this.filed5 = other.filed5;
    this.filed6 = other.filed6;
    if (other.isSetFiled7()) {
      this.filed7 = other.filed7;
    }
  }

  public s1 deepCopy() {
    return new s1(this);
  }

  @Override
  public void clear() {
    setFiled1IsSet(false);
    this.filed1 = false;
    setFiled2IsSet(false);
    this.filed2 = 0;
    setFiled3IsSet(false);
    this.filed3 = 0;
    setFiled4IsSet(false);
    this.filed4 = 0;
    setFiled5IsSet(false);
    this.filed5 = 0;
    setFiled6IsSet(false);
    this.filed6 = 0.0;
    this.filed7 = null;
  }

  public boolean isFiled1() {
    return this.filed1;
  }

  public s1 setFiled1(boolean filed1) {
    this.filed1 = filed1;
    setFiled1IsSet(true);
    return this;
  }

  public void unsetFiled1() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FILED1_ISSET_ID);
  }

  /** Returns true if field filed1 is set (has been assigned a value) and false otherwise */
  public boolean isSetFiled1() {
    return EncodingUtils.testBit(__isset_bitfield, __FILED1_ISSET_ID);
  }

  public void setFiled1IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FILED1_ISSET_ID, value);
  }

  public byte getFiled2() {
    return this.filed2;
  }

  public s1 setFiled2(byte filed2) {
    this.filed2 = filed2;
    setFiled2IsSet(true);
    return this;
  }

  public void unsetFiled2() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FILED2_ISSET_ID);
  }

  /** Returns true if field filed2 is set (has been assigned a value) and false otherwise */
  public boolean isSetFiled2() {
    return EncodingUtils.testBit(__isset_bitfield, __FILED2_ISSET_ID);
  }

  public void setFiled2IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FILED2_ISSET_ID, value);
  }

  public short getFiled3() {
    return this.filed3;
  }

  public s1 setFiled3(short filed3) {
    this.filed3 = filed3;
    setFiled3IsSet(true);
    return this;
  }

  public void unsetFiled3() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FILED3_ISSET_ID);
  }

  /** Returns true if field filed3 is set (has been assigned a value) and false otherwise */
  public boolean isSetFiled3() {
    return EncodingUtils.testBit(__isset_bitfield, __FILED3_ISSET_ID);
  }

  public void setFiled3IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FILED3_ISSET_ID, value);
  }

  public int getFiled4() {
    return this.filed4;
  }

  public s1 setFiled4(int filed4) {
    this.filed4 = filed4;
    setFiled4IsSet(true);
    return this;
  }

  public void unsetFiled4() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FILED4_ISSET_ID);
  }

  /** Returns true if field filed4 is set (has been assigned a value) and false otherwise */
  public boolean isSetFiled4() {
    return EncodingUtils.testBit(__isset_bitfield, __FILED4_ISSET_ID);
  }

  public void setFiled4IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FILED4_ISSET_ID, value);
  }

  public long getFiled5() {
    return this.filed5;
  }

  public s1 setFiled5(long filed5) {
    this.filed5 = filed5;
    setFiled5IsSet(true);
    return this;
  }

  public void unsetFiled5() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FILED5_ISSET_ID);
  }

  /** Returns true if field filed5 is set (has been assigned a value) and false otherwise */
  public boolean isSetFiled5() {
    return EncodingUtils.testBit(__isset_bitfield, __FILED5_ISSET_ID);
  }

  public void setFiled5IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FILED5_ISSET_ID, value);
  }

  public double getFiled6() {
    return this.filed6;
  }

  public s1 setFiled6(double filed6) {
    this.filed6 = filed6;
    setFiled6IsSet(true);
    return this;
  }

  public void unsetFiled6() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FILED6_ISSET_ID);
  }

  /** Returns true if field filed6 is set (has been assigned a value) and false otherwise */
  public boolean isSetFiled6() {
    return EncodingUtils.testBit(__isset_bitfield, __FILED6_ISSET_ID);
  }

  public void setFiled6IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FILED6_ISSET_ID, value);
  }

  public String getFiled7() {
    return this.filed7;
  }

  public s1 setFiled7(String filed7) {
    this.filed7 = filed7;
    return this;
  }

  public void unsetFiled7() {
    this.filed7 = null;
  }

  /** Returns true if field filed7 is set (has been assigned a value) and false otherwise */
  public boolean isSetFiled7() {
    return this.filed7 != null;
  }

  public void setFiled7IsSet(boolean value) {
    if (!value) {
      this.filed7 = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILED1:
      if (value == null) {
        unsetFiled1();
      } else {
        setFiled1((Boolean)value);
      }
      break;

    case FILED2:
      if (value == null) {
        unsetFiled2();
      } else {
        setFiled2((Byte)value);
      }
      break;

    case FILED3:
      if (value == null) {
        unsetFiled3();
      } else {
        setFiled3((Short)value);
      }
      break;

    case FILED4:
      if (value == null) {
        unsetFiled4();
      } else {
        setFiled4((Integer)value);
      }
      break;

    case FILED5:
      if (value == null) {
        unsetFiled5();
      } else {
        setFiled5((Long)value);
      }
      break;

    case FILED6:
      if (value == null) {
        unsetFiled6();
      } else {
        setFiled6((Double)value);
      }
      break;

    case FILED7:
      if (value == null) {
        unsetFiled7();
      } else {
        setFiled7((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILED1:
      return isFiled1();

    case FILED2:
      return getFiled2();

    case FILED3:
      return getFiled3();

    case FILED4:
      return getFiled4();

    case FILED5:
      return getFiled5();

    case FILED6:
      return getFiled6();

    case FILED7:
      return getFiled7();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILED1:
      return isSetFiled1();
    case FILED2:
      return isSetFiled2();
    case FILED3:
      return isSetFiled3();
    case FILED4:
      return isSetFiled4();
    case FILED5:
      return isSetFiled5();
    case FILED6:
      return isSetFiled6();
    case FILED7:
      return isSetFiled7();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof s1)
      return this.equals((s1)that);
    return false;
  }

  public boolean equals(s1 that) {
    if (that == null)
      return false;

    boolean this_present_filed1 = true;
    boolean that_present_filed1 = true;
    if (this_present_filed1 || that_present_filed1) {
      if (!(this_present_filed1 && that_present_filed1))
        return false;
      if (this.filed1 != that.filed1)
        return false;
    }

    boolean this_present_filed2 = true;
    boolean that_present_filed2 = true;
    if (this_present_filed2 || that_present_filed2) {
      if (!(this_present_filed2 && that_present_filed2))
        return false;
      if (this.filed2 != that.filed2)
        return false;
    }

    boolean this_present_filed3 = true;
    boolean that_present_filed3 = true;
    if (this_present_filed3 || that_present_filed3) {
      if (!(this_present_filed3 && that_present_filed3))
        return false;
      if (this.filed3 != that.filed3)
        return false;
    }

    boolean this_present_filed4 = true;
    boolean that_present_filed4 = true;
    if (this_present_filed4 || that_present_filed4) {
      if (!(this_present_filed4 && that_present_filed4))
        return false;
      if (this.filed4 != that.filed4)
        return false;
    }

    boolean this_present_filed5 = true;
    boolean that_present_filed5 = true;
    if (this_present_filed5 || that_present_filed5) {
      if (!(this_present_filed5 && that_present_filed5))
        return false;
      if (this.filed5 != that.filed5)
        return false;
    }

    boolean this_present_filed6 = true;
    boolean that_present_filed6 = true;
    if (this_present_filed6 || that_present_filed6) {
      if (!(this_present_filed6 && that_present_filed6))
        return false;
      if (this.filed6 != that.filed6)
        return false;
    }

    boolean this_present_filed7 = true && this.isSetFiled7();
    boolean that_present_filed7 = true && that.isSetFiled7();
    if (this_present_filed7 || that_present_filed7) {
      if (!(this_present_filed7 && that_present_filed7))
        return false;
      if (!this.filed7.equals(that.filed7))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_filed1 = true;
    list.add(present_filed1);
    if (present_filed1)
      list.add(filed1);

    boolean present_filed2 = true;
    list.add(present_filed2);
    if (present_filed2)
      list.add(filed2);

    boolean present_filed3 = true;
    list.add(present_filed3);
    if (present_filed3)
      list.add(filed3);

    boolean present_filed4 = true;
    list.add(present_filed4);
    if (present_filed4)
      list.add(filed4);

    boolean present_filed5 = true;
    list.add(present_filed5);
    if (present_filed5)
      list.add(filed5);

    boolean present_filed6 = true;
    list.add(present_filed6);
    if (present_filed6)
      list.add(filed6);

    boolean present_filed7 = true && (isSetFiled7());
    list.add(present_filed7);
    if (present_filed7)
      list.add(filed7);

    return list.hashCode();
  }

  @Override
  public int compareTo(s1 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFiled1()).compareTo(other.isSetFiled1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFiled1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filed1, other.filed1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFiled2()).compareTo(other.isSetFiled2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFiled2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filed2, other.filed2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFiled3()).compareTo(other.isSetFiled3());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFiled3()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filed3, other.filed3);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFiled4()).compareTo(other.isSetFiled4());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFiled4()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filed4, other.filed4);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFiled5()).compareTo(other.isSetFiled5());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFiled5()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filed5, other.filed5);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFiled6()).compareTo(other.isSetFiled6());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFiled6()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filed6, other.filed6);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFiled7()).compareTo(other.isSetFiled7());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFiled7()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filed7, other.filed7);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("s1(");
    boolean first = true;

    sb.append("filed1:");
    sb.append(this.filed1);
    first = false;
    if (!first) sb.append(", ");
    sb.append("filed2:");
    sb.append(this.filed2);
    first = false;
    if (!first) sb.append(", ");
    sb.append("filed3:");
    sb.append(this.filed3);
    first = false;
    if (!first) sb.append(", ");
    sb.append("filed4:");
    sb.append(this.filed4);
    first = false;
    if (!first) sb.append(", ");
    sb.append("filed5:");
    sb.append(this.filed5);
    first = false;
    if (!first) sb.append(", ");
    sb.append("filed6:");
    sb.append(this.filed6);
    first = false;
    if (!first) sb.append(", ");
    sb.append("filed7:");
    if (this.filed7 == null) {
      sb.append("null");
    } else {
      sb.append(this.filed7);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class s1StandardSchemeFactory implements SchemeFactory {
    public s1StandardScheme getScheme() {
      return new s1StandardScheme();
    }
  }

  private static class s1StandardScheme extends StandardScheme<s1> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, s1 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILED1
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.filed1 = iprot.readBool();
              struct.setFiled1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FILED2
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.filed2 = iprot.readByte();
              struct.setFiled2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FILED3
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.filed3 = iprot.readI16();
              struct.setFiled3IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FILED4
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.filed4 = iprot.readI32();
              struct.setFiled4IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FILED5
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.filed5 = iprot.readI64();
              struct.setFiled5IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // FILED6
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.filed6 = iprot.readDouble();
              struct.setFiled6IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // FILED7
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.filed7 = iprot.readString();
              struct.setFiled7IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, s1 struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(FILED1_FIELD_DESC);
      oprot.writeBool(struct.filed1);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FILED2_FIELD_DESC);
      oprot.writeByte(struct.filed2);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FILED3_FIELD_DESC);
      oprot.writeI16(struct.filed3);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FILED4_FIELD_DESC);
      oprot.writeI32(struct.filed4);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FILED5_FIELD_DESC);
      oprot.writeI64(struct.filed5);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FILED6_FIELD_DESC);
      oprot.writeDouble(struct.filed6);
      oprot.writeFieldEnd();
      if (struct.filed7 != null) {
        oprot.writeFieldBegin(FILED7_FIELD_DESC);
        oprot.writeString(struct.filed7);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class s1TupleSchemeFactory implements SchemeFactory {
    public s1TupleScheme getScheme() {
      return new s1TupleScheme();
    }
  }

  private static class s1TupleScheme extends TupleScheme<s1> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, s1 struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFiled1()) {
        optionals.set(0);
      }
      if (struct.isSetFiled2()) {
        optionals.set(1);
      }
      if (struct.isSetFiled3()) {
        optionals.set(2);
      }
      if (struct.isSetFiled4()) {
        optionals.set(3);
      }
      if (struct.isSetFiled5()) {
        optionals.set(4);
      }
      if (struct.isSetFiled6()) {
        optionals.set(5);
      }
      if (struct.isSetFiled7()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetFiled1()) {
        oprot.writeBool(struct.filed1);
      }
      if (struct.isSetFiled2()) {
        oprot.writeByte(struct.filed2);
      }
      if (struct.isSetFiled3()) {
        oprot.writeI16(struct.filed3);
      }
      if (struct.isSetFiled4()) {
        oprot.writeI32(struct.filed4);
      }
      if (struct.isSetFiled5()) {
        oprot.writeI64(struct.filed5);
      }
      if (struct.isSetFiled6()) {
        oprot.writeDouble(struct.filed6);
      }
      if (struct.isSetFiled7()) {
        oprot.writeString(struct.filed7);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, s1 struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.filed1 = iprot.readBool();
        struct.setFiled1IsSet(true);
      }
      if (incoming.get(1)) {
        struct.filed2 = iprot.readByte();
        struct.setFiled2IsSet(true);
      }
      if (incoming.get(2)) {
        struct.filed3 = iprot.readI16();
        struct.setFiled3IsSet(true);
      }
      if (incoming.get(3)) {
        struct.filed4 = iprot.readI32();
        struct.setFiled4IsSet(true);
      }
      if (incoming.get(4)) {
        struct.filed5 = iprot.readI64();
        struct.setFiled5IsSet(true);
      }
      if (incoming.get(5)) {
        struct.filed6 = iprot.readDouble();
        struct.setFiled6IsSet(true);
      }
      if (incoming.get(6)) {
        struct.filed7 = iprot.readString();
        struct.setFiled7IsSet(true);
      }
    }
  }

}

