// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LightsDevice.proto

package LightsDevice.proto.li;

/**
 * Protobuf type {@code LightsDevice.lightToUpdateRequest}
 */
public  final class lightToUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LightsDevice.lightToUpdateRequest)
    lightToUpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use lightToUpdateRequest.newBuilder() to construct.
  private lightToUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private lightToUpdateRequest() {
    lightId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private lightToUpdateRequest(
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

            lightId_ = input.readInt32();
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
    return LightsDevice.proto.li.ClassName.internal_static_LightsDevice_lightToUpdateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return LightsDevice.proto.li.ClassName.internal_static_LightsDevice_lightToUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            LightsDevice.proto.li.lightToUpdateRequest.class, LightsDevice.proto.li.lightToUpdateRequest.Builder.class);
  }

  public static final int LIGHT_ID_FIELD_NUMBER = 1;
  private int lightId_;
  /**
   * <code>int32 light_id = 1;</code>
   */
  public int getLightId() {
    return lightId_;
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
    if (lightId_ != 0) {
      output.writeInt32(1, lightId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lightId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, lightId_);
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
    if (!(obj instanceof LightsDevice.proto.li.lightToUpdateRequest)) {
      return super.equals(obj);
    }
    LightsDevice.proto.li.lightToUpdateRequest other = (LightsDevice.proto.li.lightToUpdateRequest) obj;

    boolean result = true;
    result = result && (getLightId()
        == other.getLightId());
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
    hash = (37 * hash) + LIGHT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLightId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static LightsDevice.proto.li.lightToUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LightsDevice.proto.li.lightToUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LightsDevice.proto.li.lightToUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LightsDevice.proto.li.lightToUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LightsDevice.proto.li.lightToUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LightsDevice.proto.li.lightToUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LightsDevice.proto.li.lightToUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LightsDevice.proto.li.lightToUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static LightsDevice.proto.li.lightToUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static LightsDevice.proto.li.lightToUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static LightsDevice.proto.li.lightToUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LightsDevice.proto.li.lightToUpdateRequest parseFrom(
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
  public static Builder newBuilder(LightsDevice.proto.li.lightToUpdateRequest prototype) {
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
   * Protobuf type {@code LightsDevice.lightToUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LightsDevice.lightToUpdateRequest)
      LightsDevice.proto.li.lightToUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LightsDevice.proto.li.ClassName.internal_static_LightsDevice_lightToUpdateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LightsDevice.proto.li.ClassName.internal_static_LightsDevice_lightToUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LightsDevice.proto.li.lightToUpdateRequest.class, LightsDevice.proto.li.lightToUpdateRequest.Builder.class);
    }

    // Construct using LightsDevice.proto.li.lightToUpdateRequest.newBuilder()
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
      lightId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return LightsDevice.proto.li.ClassName.internal_static_LightsDevice_lightToUpdateRequest_descriptor;
    }

    @java.lang.Override
    public LightsDevice.proto.li.lightToUpdateRequest getDefaultInstanceForType() {
      return LightsDevice.proto.li.lightToUpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public LightsDevice.proto.li.lightToUpdateRequest build() {
      LightsDevice.proto.li.lightToUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public LightsDevice.proto.li.lightToUpdateRequest buildPartial() {
      LightsDevice.proto.li.lightToUpdateRequest result = new LightsDevice.proto.li.lightToUpdateRequest(this);
      result.lightId_ = lightId_;
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
      if (other instanceof LightsDevice.proto.li.lightToUpdateRequest) {
        return mergeFrom((LightsDevice.proto.li.lightToUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(LightsDevice.proto.li.lightToUpdateRequest other) {
      if (other == LightsDevice.proto.li.lightToUpdateRequest.getDefaultInstance()) return this;
      if (other.getLightId() != 0) {
        setLightId(other.getLightId());
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
      LightsDevice.proto.li.lightToUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (LightsDevice.proto.li.lightToUpdateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int lightId_ ;
    /**
     * <code>int32 light_id = 1;</code>
     */
    public int getLightId() {
      return lightId_;
    }
    /**
     * <code>int32 light_id = 1;</code>
     */
    public Builder setLightId(int value) {
      
      lightId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 light_id = 1;</code>
     */
    public Builder clearLightId() {
      
      lightId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:LightsDevice.lightToUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:LightsDevice.lightToUpdateRequest)
  private static final LightsDevice.proto.li.lightToUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LightsDevice.proto.li.lightToUpdateRequest();
  }

  public static LightsDevice.proto.li.lightToUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<lightToUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<lightToUpdateRequest>() {
    @java.lang.Override
    public lightToUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new lightToUpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<lightToUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<lightToUpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public LightsDevice.proto.li.lightToUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

