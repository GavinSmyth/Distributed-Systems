// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HeatingDevice.proto

package HeatingDevice.proto.h;

/**
 * Protobuf type {@code HeatingDevice.HeaterStatusRequest}
 */
public  final class HeaterStatusRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HeatingDevice.HeaterStatusRequest)
    HeaterStatusRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeaterStatusRequest.newBuilder() to construct.
  private HeaterStatusRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeaterStatusRequest() {
    heaterId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HeaterStatusRequest(
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

            heaterId_ = input.readInt32();
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
    return HeatingDevice.proto.h.ClassName.internal_static_HeatingDevice_HeaterStatusRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return HeatingDevice.proto.h.ClassName.internal_static_HeatingDevice_HeaterStatusRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            HeatingDevice.proto.h.HeaterStatusRequest.class, HeatingDevice.proto.h.HeaterStatusRequest.Builder.class);
  }

  public static final int HEATER_ID_FIELD_NUMBER = 1;
  private int heaterId_;
  /**
   * <code>int32 heater_id = 1;</code>
   */
  public int getHeaterId() {
    return heaterId_;
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
    if (heaterId_ != 0) {
      output.writeInt32(1, heaterId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (heaterId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, heaterId_);
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
    if (!(obj instanceof HeatingDevice.proto.h.HeaterStatusRequest)) {
      return super.equals(obj);
    }
    HeatingDevice.proto.h.HeaterStatusRequest other = (HeatingDevice.proto.h.HeaterStatusRequest) obj;

    boolean result = true;
    result = result && (getHeaterId()
        == other.getHeaterId());
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
    hash = (37 * hash) + HEATER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getHeaterId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static HeatingDevice.proto.h.HeaterStatusRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static HeatingDevice.proto.h.HeaterStatusRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static HeatingDevice.proto.h.HeaterStatusRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static HeatingDevice.proto.h.HeaterStatusRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static HeatingDevice.proto.h.HeaterStatusRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static HeatingDevice.proto.h.HeaterStatusRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static HeatingDevice.proto.h.HeaterStatusRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static HeatingDevice.proto.h.HeaterStatusRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static HeatingDevice.proto.h.HeaterStatusRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static HeatingDevice.proto.h.HeaterStatusRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static HeatingDevice.proto.h.HeaterStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static HeatingDevice.proto.h.HeaterStatusRequest parseFrom(
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
  public static Builder newBuilder(HeatingDevice.proto.h.HeaterStatusRequest prototype) {
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
   * Protobuf type {@code HeatingDevice.HeaterStatusRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HeatingDevice.HeaterStatusRequest)
      HeatingDevice.proto.h.HeaterStatusRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HeatingDevice.proto.h.ClassName.internal_static_HeatingDevice_HeaterStatusRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HeatingDevice.proto.h.ClassName.internal_static_HeatingDevice_HeaterStatusRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HeatingDevice.proto.h.HeaterStatusRequest.class, HeatingDevice.proto.h.HeaterStatusRequest.Builder.class);
    }

    // Construct using HeatingDevice.proto.h.HeaterStatusRequest.newBuilder()
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
      heaterId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return HeatingDevice.proto.h.ClassName.internal_static_HeatingDevice_HeaterStatusRequest_descriptor;
    }

    @java.lang.Override
    public HeatingDevice.proto.h.HeaterStatusRequest getDefaultInstanceForType() {
      return HeatingDevice.proto.h.HeaterStatusRequest.getDefaultInstance();
    }

    @java.lang.Override
    public HeatingDevice.proto.h.HeaterStatusRequest build() {
      HeatingDevice.proto.h.HeaterStatusRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public HeatingDevice.proto.h.HeaterStatusRequest buildPartial() {
      HeatingDevice.proto.h.HeaterStatusRequest result = new HeatingDevice.proto.h.HeaterStatusRequest(this);
      result.heaterId_ = heaterId_;
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
      if (other instanceof HeatingDevice.proto.h.HeaterStatusRequest) {
        return mergeFrom((HeatingDevice.proto.h.HeaterStatusRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(HeatingDevice.proto.h.HeaterStatusRequest other) {
      if (other == HeatingDevice.proto.h.HeaterStatusRequest.getDefaultInstance()) return this;
      if (other.getHeaterId() != 0) {
        setHeaterId(other.getHeaterId());
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
      HeatingDevice.proto.h.HeaterStatusRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (HeatingDevice.proto.h.HeaterStatusRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int heaterId_ ;
    /**
     * <code>int32 heater_id = 1;</code>
     */
    public int getHeaterId() {
      return heaterId_;
    }
    /**
     * <code>int32 heater_id = 1;</code>
     */
    public Builder setHeaterId(int value) {
      
      heaterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 heater_id = 1;</code>
     */
    public Builder clearHeaterId() {
      
      heaterId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:HeatingDevice.HeaterStatusRequest)
  }

  // @@protoc_insertion_point(class_scope:HeatingDevice.HeaterStatusRequest)
  private static final HeatingDevice.proto.h.HeaterStatusRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new HeatingDevice.proto.h.HeaterStatusRequest();
  }

  public static HeatingDevice.proto.h.HeaterStatusRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeaterStatusRequest>
      PARSER = new com.google.protobuf.AbstractParser<HeaterStatusRequest>() {
    @java.lang.Override
    public HeaterStatusRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HeaterStatusRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HeaterStatusRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeaterStatusRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public HeatingDevice.proto.h.HeaterStatusRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

