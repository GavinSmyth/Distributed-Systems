// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AirConditioningDevice.proto

package AircondioningDevice.proto.ac;

public final class ClassName {
  private ClassName() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AirConditioningDevice_AirConditioning_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AirConditioningDevice_AirConditioning_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AirConditioningDevice_deviceIDRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AirConditioningDevice_deviceIDRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AirConditioningDevice_TempRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AirConditioningDevice_TempRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AirConditioningDevice_ACResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AirConditioningDevice_ACResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AirConditioningDevice.proto\022\025AirCondit" +
      "ioningDevice\"i\n\017AirConditioning\022\020\n\010devic" +
      "eId\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\020\n\010location\030\003 \001(" +
      "\t\022\016\n\006status\030\004 \001(\t\022\024\n\014newTempature\030\005 \001(\005\"" +
      "$\n\017deviceIDRequest\022\021\n\tdevice_id\030\001 \001(\005\"2\n" +
      "\013TempRequest\022\021\n\tdevice_id\030\001 \001(\005\022\020\n\010new_t" +
      "emp\030\002 \001(\005\"M\n\nACResponse\022?\n\017airConditioni" +
      "ng\030\001 \001(\0132&.AirConditioningDevice.AirCond" +
      "itioning2\371\002\n\027Airconditioning_service\022]\n\016" +
      "currentDetails\022&.AirConditioningDevice.d" +
      "eviceIDRequest\032!.AirConditioningDevice.A" +
      "CResponse\"\000\022R\n\007setTemp\022\".AirConditioning" +
      "Device.TempRequest\032!.AirConditioningDevi" +
      "ce.ACResponse\"\000\022U\n\006setOff\022&.AirCondition" +
      "ingDevice.deviceIDRequest\032!.AirCondition" +
      "ingDevice.ACResponse\"\000\022T\n\005setOn\022&.AirCon" +
      "ditioningDevice.deviceIDRequest\032!.AirCon" +
      "ditioningDevice.ACResponse\"\000B+\n\034Aircondi" +
      "oningDevice.proto.acB\tClassNameP\001b\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_AirConditioningDevice_AirConditioning_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AirConditioningDevice_AirConditioning_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AirConditioningDevice_AirConditioning_descriptor,
        new java.lang.String[] { "DeviceId", "Name", "Location", "Status", "NewTempature", });
    internal_static_AirConditioningDevice_deviceIDRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AirConditioningDevice_deviceIDRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AirConditioningDevice_deviceIDRequest_descriptor,
        new java.lang.String[] { "DeviceId", });
    internal_static_AirConditioningDevice_TempRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AirConditioningDevice_TempRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AirConditioningDevice_TempRequest_descriptor,
        new java.lang.String[] { "DeviceId", "NewTemp", });
    internal_static_AirConditioningDevice_ACResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_AirConditioningDevice_ACResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AirConditioningDevice_ACResponse_descriptor,
        new java.lang.String[] { "AirConditioning", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
