// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AirConditioningDevice.proto

package AircondioningDevice.proto.ac;

/**
 * Protobuf type {@code AirConditioningDevice.ACResponse}
 */
public  final class ACResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AirConditioningDevice.ACResponse)
    ACResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ACResponse.newBuilder() to construct.
  private ACResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ACResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ACResponse(
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
          case 10: {
            AircondioningDevice.proto.ac.AirConditioning.Builder subBuilder = null;
            if (airConditioning_ != null) {
              subBuilder = airConditioning_.toBuilder();
            }
            airConditioning_ = input.readMessage(AircondioningDevice.proto.ac.AirConditioning.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(airConditioning_);
              airConditioning_ = subBuilder.buildPartial();
            }

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
    return AircondioningDevice.proto.ac.ClassName.internal_static_AirConditioningDevice_ACResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return AircondioningDevice.proto.ac.ClassName.internal_static_AirConditioningDevice_ACResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AircondioningDevice.proto.ac.ACResponse.class, AircondioningDevice.proto.ac.ACResponse.Builder.class);
  }

  public static final int AIRCONDITIONING_FIELD_NUMBER = 1;
  private AircondioningDevice.proto.ac.AirConditioning airConditioning_;
  /**
   * <code>.AirConditioningDevice.AirConditioning airConditioning = 1;</code>
   */
  public boolean hasAirConditioning() {
    return airConditioning_ != null;
  }
  /**
   * <code>.AirConditioningDevice.AirConditioning airConditioning = 1;</code>
   */
  public AircondioningDevice.proto.ac.AirConditioning getAirConditioning() {
    return airConditioning_ == null ? AircondioningDevice.proto.ac.AirConditioning.getDefaultInstance() : airConditioning_;
  }
  /**
   * <code>.AirConditioningDevice.AirConditioning airConditioning = 1;</code>
   */
  public AircondioningDevice.proto.ac.AirConditioningOrBuilder getAirConditioningOrBuilder() {
    return getAirConditioning();
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
    if (airConditioning_ != null) {
      output.writeMessage(1, getAirConditioning());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (airConditioning_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAirConditioning());
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
    if (!(obj instanceof AircondioningDevice.proto.ac.ACResponse)) {
      return super.equals(obj);
    }
    AircondioningDevice.proto.ac.ACResponse other = (AircondioningDevice.proto.ac.ACResponse) obj;

    boolean result = true;
    result = result && (hasAirConditioning() == other.hasAirConditioning());
    if (hasAirConditioning()) {
      result = result && getAirConditioning()
          .equals(other.getAirConditioning());
    }
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
    if (hasAirConditioning()) {
      hash = (37 * hash) + AIRCONDITIONING_FIELD_NUMBER;
      hash = (53 * hash) + getAirConditioning().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AircondioningDevice.proto.ac.ACResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AircondioningDevice.proto.ac.ACResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AircondioningDevice.proto.ac.ACResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AircondioningDevice.proto.ac.ACResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AircondioningDevice.proto.ac.ACResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AircondioningDevice.proto.ac.ACResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AircondioningDevice.proto.ac.ACResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AircondioningDevice.proto.ac.ACResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AircondioningDevice.proto.ac.ACResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AircondioningDevice.proto.ac.ACResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AircondioningDevice.proto.ac.ACResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AircondioningDevice.proto.ac.ACResponse parseFrom(
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
  public static Builder newBuilder(AircondioningDevice.proto.ac.ACResponse prototype) {
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
   * Protobuf type {@code AirConditioningDevice.ACResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AirConditioningDevice.ACResponse)
      AircondioningDevice.proto.ac.ACResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AircondioningDevice.proto.ac.ClassName.internal_static_AirConditioningDevice_ACResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AircondioningDevice.proto.ac.ClassName.internal_static_AirConditioningDevice_ACResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AircondioningDevice.proto.ac.ACResponse.class, AircondioningDevice.proto.ac.ACResponse.Builder.class);
    }

    // Construct using AircondioningDevice.proto.ac.ACResponse.newBuilder()
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
      if (airConditioningBuilder_ == null) {
        airConditioning_ = null;
      } else {
        airConditioning_ = null;
        airConditioningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return AircondioningDevice.proto.ac.ClassName.internal_static_AirConditioningDevice_ACResponse_descriptor;
    }

    @java.lang.Override
    public AircondioningDevice.proto.ac.ACResponse getDefaultInstanceForType() {
      return AircondioningDevice.proto.ac.ACResponse.getDefaultInstance();
    }

    @java.lang.Override
    public AircondioningDevice.proto.ac.ACResponse build() {
      AircondioningDevice.proto.ac.ACResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public AircondioningDevice.proto.ac.ACResponse buildPartial() {
      AircondioningDevice.proto.ac.ACResponse result = new AircondioningDevice.proto.ac.ACResponse(this);
      if (airConditioningBuilder_ == null) {
        result.airConditioning_ = airConditioning_;
      } else {
        result.airConditioning_ = airConditioningBuilder_.build();
      }
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
      if (other instanceof AircondioningDevice.proto.ac.ACResponse) {
        return mergeFrom((AircondioningDevice.proto.ac.ACResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AircondioningDevice.proto.ac.ACResponse other) {
      if (other == AircondioningDevice.proto.ac.ACResponse.getDefaultInstance()) return this;
      if (other.hasAirConditioning()) {
        mergeAirConditioning(other.getAirConditioning());
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
      AircondioningDevice.proto.ac.ACResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AircondioningDevice.proto.ac.ACResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private AircondioningDevice.proto.ac.AirConditioning airConditioning_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        AircondioningDevice.proto.ac.AirConditioning, AircondioningDevice.proto.ac.AirConditioning.Builder, AircondioningDevice.proto.ac.AirConditioningOrBuilder> airConditioningBuilder_;
    /**
     * <code>.AirConditioningDevice.AirConditioning airConditioning = 1;</code>
     */
    public boolean hasAirConditioning() {
      return airConditioningBuilder_ != null || airConditioning_ != null;
    }
    /**
     * <code>.AirConditioningDevice.AirConditioning airConditioning = 1;</code>
     */
    public AircondioningDevice.proto.ac.AirConditioning getAirConditioning() {
      if (airConditioningBuilder_ == null) {
        return airConditioning_ == null ? AircondioningDevice.proto.ac.AirConditioning.getDefaultInstance() : airConditioning_;
      } else {
        return airConditioningBuilder_.getMessage();
      }
    }
    /**
     * <code>.AirConditioningDevice.AirConditioning airConditioning = 1;</code>
     */
    public Builder setAirConditioning(AircondioningDevice.proto.ac.AirConditioning value) {
      if (airConditioningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        airConditioning_ = value;
        onChanged();
      } else {
        airConditioningBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.AirConditioningDevice.AirConditioning airConditioning = 1;</code>
     */
    public Builder setAirConditioning(
        AircondioningDevice.proto.ac.AirConditioning.Builder builderForValue) {
      if (airConditioningBuilder_ == null) {
        airConditioning_ = builderForValue.build();
        onChanged();
      } else {
        airConditioningBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.AirConditioningDevice.AirConditioning airConditioning = 1;</code>
     */
    public Builder mergeAirConditioning(AircondioningDevice.proto.ac.AirConditioning value) {
      if (airConditioningBuilder_ == null) {
        if (airConditioning_ != null) {
          airConditioning_ =
            AircondioningDevice.proto.ac.AirConditioning.newBuilder(airConditioning_).mergeFrom(value).buildPartial();
        } else {
          airConditioning_ = value;
        }
        onChanged();
      } else {
        airConditioningBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.AirConditioningDevice.AirConditioning airConditioning = 1;</code>
     */
    public Builder clearAirConditioning() {
      if (airConditioningBuilder_ == null) {
        airConditioning_ = null;
        onChanged();
      } else {
        airConditioning_ = null;
        airConditioningBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.AirConditioningDevice.AirConditioning airConditioning = 1;</code>
     */
    public AircondioningDevice.proto.ac.AirConditioning.Builder getAirConditioningBuilder() {
      
      onChanged();
      return getAirConditioningFieldBuilder().getBuilder();
    }
    /**
     * <code>.AirConditioningDevice.AirConditioning airConditioning = 1;</code>
     */
    public AircondioningDevice.proto.ac.AirConditioningOrBuilder getAirConditioningOrBuilder() {
      if (airConditioningBuilder_ != null) {
        return airConditioningBuilder_.getMessageOrBuilder();
      } else {
        return airConditioning_ == null ?
            AircondioningDevice.proto.ac.AirConditioning.getDefaultInstance() : airConditioning_;
      }
    }
    /**
     * <code>.AirConditioningDevice.AirConditioning airConditioning = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        AircondioningDevice.proto.ac.AirConditioning, AircondioningDevice.proto.ac.AirConditioning.Builder, AircondioningDevice.proto.ac.AirConditioningOrBuilder> 
        getAirConditioningFieldBuilder() {
      if (airConditioningBuilder_ == null) {
        airConditioningBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            AircondioningDevice.proto.ac.AirConditioning, AircondioningDevice.proto.ac.AirConditioning.Builder, AircondioningDevice.proto.ac.AirConditioningOrBuilder>(
                getAirConditioning(),
                getParentForChildren(),
                isClean());
        airConditioning_ = null;
      }
      return airConditioningBuilder_;
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


    // @@protoc_insertion_point(builder_scope:AirConditioningDevice.ACResponse)
  }

  // @@protoc_insertion_point(class_scope:AirConditioningDevice.ACResponse)
  private static final AircondioningDevice.proto.ac.ACResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AircondioningDevice.proto.ac.ACResponse();
  }

  public static AircondioningDevice.proto.ac.ACResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ACResponse>
      PARSER = new com.google.protobuf.AbstractParser<ACResponse>() {
    @java.lang.Override
    public ACResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ACResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ACResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ACResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public AircondioningDevice.proto.ac.ACResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

