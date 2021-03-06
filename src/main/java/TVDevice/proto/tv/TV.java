// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Tv.proto

package TVDevice.proto.tv;

/**
 * Protobuf type {@code Tv.TV}
 */
public  final class TV extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Tv.TV)
    TVOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TV.newBuilder() to construct.
  private TV(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TV() {
    tvId_ = 0;
    deviceLocation_ = "";
    status_ = "";
    exact_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TV(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            tvId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceLocation_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          case 32: {

            exact_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return TVDevice.proto.tv.ClassName.internal_static_Tv_TV_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TVDevice.proto.tv.ClassName.internal_static_Tv_TV_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            TVDevice.proto.tv.TV.class, TVDevice.proto.tv.TV.Builder.class);
  }

  public static final int TV_ID_FIELD_NUMBER = 1;
  private int tvId_;
  /**
   * <code>int32 tv_id = 1;</code>
   */
  public int getTvId() {
    return tvId_;
  }

  public static final int DEVICE_LOCATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object deviceLocation_;
  /**
   * <code>string device_location = 2;</code>
   */
  public java.lang.String getDeviceLocation() {
    java.lang.Object ref = deviceLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceLocation_ = s;
      return s;
    }
  }
  /**
   * <code>string device_location = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDeviceLocationBytes() {
    java.lang.Object ref = deviceLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceLocation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private volatile java.lang.Object status_;
  /**
   * <code>string status = 3;</code>
   */
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <code>string status = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXACT_FIELD_NUMBER = 4;
  private int exact_;
  /**
   * <code>int32 exact = 4;</code>
   */
  public int getExact() {
    return exact_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (tvId_ != 0) {
      output.writeInt32(1, tvId_);
    }
    if (!getDeviceLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceLocation_);
    }
    if (!getStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, status_);
    }
    if (exact_ != 0) {
      output.writeInt32(4, exact_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tvId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, tvId_);
    }
    if (!getDeviceLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deviceLocation_);
    }
    if (!getStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, status_);
    }
    if (exact_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, exact_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof TVDevice.proto.tv.TV)) {
      return super.equals(obj);
    }
    TVDevice.proto.tv.TV other = (TVDevice.proto.tv.TV) obj;

    boolean result = true;
    result = result && (getTvId()
        == other.getTvId());
    result = result && getDeviceLocation()
        .equals(other.getDeviceLocation());
    result = result && getStatus()
        .equals(other.getStatus());
    result = result && (getExact()
        == other.getExact());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TV_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTvId();
    hash = (37 * hash) + DEVICE_LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceLocation().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (37 * hash) + EXACT_FIELD_NUMBER;
    hash = (53 * hash) + getExact();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static TVDevice.proto.tv.TV parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TVDevice.proto.tv.TV parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TVDevice.proto.tv.TV parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TVDevice.proto.tv.TV parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TVDevice.proto.tv.TV parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TVDevice.proto.tv.TV parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TVDevice.proto.tv.TV parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TVDevice.proto.tv.TV parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static TVDevice.proto.tv.TV parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static TVDevice.proto.tv.TV parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static TVDevice.proto.tv.TV parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TVDevice.proto.tv.TV parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TVDevice.proto.tv.TV prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Tv.TV}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Tv.TV)
      TVDevice.proto.tv.TVOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TVDevice.proto.tv.ClassName.internal_static_Tv_TV_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TVDevice.proto.tv.ClassName.internal_static_Tv_TV_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TVDevice.proto.tv.TV.class, TVDevice.proto.tv.TV.Builder.class);
    }

    // Construct using TVDevice.proto.tv.TV.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      tvId_ = 0;

      deviceLocation_ = "";

      status_ = "";

      exact_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TVDevice.proto.tv.ClassName.internal_static_Tv_TV_descriptor;
    }

    @java.lang.Override
    public TVDevice.proto.tv.TV getDefaultInstanceForType() {
      return TVDevice.proto.tv.TV.getDefaultInstance();
    }

    @java.lang.Override
    public TVDevice.proto.tv.TV build() {
      TVDevice.proto.tv.TV result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public TVDevice.proto.tv.TV buildPartial() {
      TVDevice.proto.tv.TV result = new TVDevice.proto.tv.TV(this);
      result.tvId_ = tvId_;
      result.deviceLocation_ = deviceLocation_;
      result.status_ = status_;
      result.exact_ = exact_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof TVDevice.proto.tv.TV) {
        return mergeFrom((TVDevice.proto.tv.TV)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(TVDevice.proto.tv.TV other) {
      if (other == TVDevice.proto.tv.TV.getDefaultInstance()) return this;
      if (other.getTvId() != 0) {
        setTvId(other.getTvId());
      }
      if (!other.getDeviceLocation().isEmpty()) {
        deviceLocation_ = other.deviceLocation_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (other.getExact() != 0) {
        setExact(other.getExact());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      TVDevice.proto.tv.TV parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (TVDevice.proto.tv.TV) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int tvId_ ;
    /**
     * <code>int32 tv_id = 1;</code>
     */
    public int getTvId() {
      return tvId_;
    }
    /**
     * <code>int32 tv_id = 1;</code>
     */
    public Builder setTvId(int value) {
      
      tvId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 tv_id = 1;</code>
     */
    public Builder clearTvId() {
      
      tvId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object deviceLocation_ = "";
    /**
     * <code>string device_location = 2;</code>
     */
    public java.lang.String getDeviceLocation() {
      java.lang.Object ref = deviceLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device_location = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceLocationBytes() {
      java.lang.Object ref = deviceLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device_location = 2;</code>
     */
    public Builder setDeviceLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceLocation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string device_location = 2;</code>
     */
    public Builder clearDeviceLocation() {
      
      deviceLocation_ = getDefaultInstance().getDeviceLocation();
      onChanged();
      return this;
    }
    /**
     * <code>string device_location = 2;</code>
     */
    public Builder setDeviceLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceLocation_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <code>string status = 3;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string status = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string status = 3;</code>
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string status = 3;</code>
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string status = 3;</code>
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
      onChanged();
      return this;
    }

    private int exact_ ;
    /**
     * <code>int32 exact = 4;</code>
     */
    public int getExact() {
      return exact_;
    }
    /**
     * <code>int32 exact = 4;</code>
     */
    public Builder setExact(int value) {
      
      exact_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 exact = 4;</code>
     */
    public Builder clearExact() {
      
      exact_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Tv.TV)
  }

  // @@protoc_insertion_point(class_scope:Tv.TV)
  private static final TVDevice.proto.tv.TV DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TVDevice.proto.tv.TV();
  }

  public static TVDevice.proto.tv.TV getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TV>
      PARSER = new com.google.protobuf.AbstractParser<TV>() {
    @java.lang.Override
    public TV parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TV(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TV> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TV> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public TVDevice.proto.tv.TV getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

