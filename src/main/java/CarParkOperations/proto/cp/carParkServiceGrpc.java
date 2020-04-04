package CarParkOperations.proto.cp;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: CarParkOperations.proto")
public final class carParkServiceGrpc {

  private carParkServiceGrpc() {}

  public static final String SERVICE_NAME = "CarParkOperations.carParkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CarParkOperations.proto.cp.carparkRequest,
      CarParkOperations.proto.cp.carParkResponse> getShowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showStatus",
      requestType = CarParkOperations.proto.cp.carparkRequest.class,
      responseType = CarParkOperations.proto.cp.carParkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CarParkOperations.proto.cp.carparkRequest,
      CarParkOperations.proto.cp.carParkResponse> getShowStatusMethod() {
    io.grpc.MethodDescriptor<CarParkOperations.proto.cp.carparkRequest, CarParkOperations.proto.cp.carParkResponse> getShowStatusMethod;
    if ((getShowStatusMethod = carParkServiceGrpc.getShowStatusMethod) == null) {
      synchronized (carParkServiceGrpc.class) {
        if ((getShowStatusMethod = carParkServiceGrpc.getShowStatusMethod) == null) {
          carParkServiceGrpc.getShowStatusMethod = getShowStatusMethod = 
              io.grpc.MethodDescriptor.<CarParkOperations.proto.cp.carparkRequest, CarParkOperations.proto.cp.carParkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CarParkOperations.carParkService", "showStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CarParkOperations.proto.cp.carparkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CarParkOperations.proto.cp.carParkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new carParkServiceMethodDescriptorSupplier("showStatus"))
                  .build();
          }
        }
     }
     return getShowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CarParkOperations.proto.cp.CarParkToUpdateRequest,
      CarParkOperations.proto.cp.carParkResponse> getSetFullMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setFull",
      requestType = CarParkOperations.proto.cp.CarParkToUpdateRequest.class,
      responseType = CarParkOperations.proto.cp.carParkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CarParkOperations.proto.cp.CarParkToUpdateRequest,
      CarParkOperations.proto.cp.carParkResponse> getSetFullMethod() {
    io.grpc.MethodDescriptor<CarParkOperations.proto.cp.CarParkToUpdateRequest, CarParkOperations.proto.cp.carParkResponse> getSetFullMethod;
    if ((getSetFullMethod = carParkServiceGrpc.getSetFullMethod) == null) {
      synchronized (carParkServiceGrpc.class) {
        if ((getSetFullMethod = carParkServiceGrpc.getSetFullMethod) == null) {
          carParkServiceGrpc.getSetFullMethod = getSetFullMethod = 
              io.grpc.MethodDescriptor.<CarParkOperations.proto.cp.CarParkToUpdateRequest, CarParkOperations.proto.cp.carParkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CarParkOperations.carParkService", "setFull"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CarParkOperations.proto.cp.CarParkToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CarParkOperations.proto.cp.carParkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new carParkServiceMethodDescriptorSupplier("setFull"))
                  .build();
          }
        }
     }
     return getSetFullMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CarParkOperations.proto.cp.CarParkToUpdateRequest,
      CarParkOperations.proto.cp.carParkResponse> getSetSpacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setSpaces",
      requestType = CarParkOperations.proto.cp.CarParkToUpdateRequest.class,
      responseType = CarParkOperations.proto.cp.carParkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CarParkOperations.proto.cp.CarParkToUpdateRequest,
      CarParkOperations.proto.cp.carParkResponse> getSetSpacesMethod() {
    io.grpc.MethodDescriptor<CarParkOperations.proto.cp.CarParkToUpdateRequest, CarParkOperations.proto.cp.carParkResponse> getSetSpacesMethod;
    if ((getSetSpacesMethod = carParkServiceGrpc.getSetSpacesMethod) == null) {
      synchronized (carParkServiceGrpc.class) {
        if ((getSetSpacesMethod = carParkServiceGrpc.getSetSpacesMethod) == null) {
          carParkServiceGrpc.getSetSpacesMethod = getSetSpacesMethod = 
              io.grpc.MethodDescriptor.<CarParkOperations.proto.cp.CarParkToUpdateRequest, CarParkOperations.proto.cp.carParkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CarParkOperations.carParkService", "setSpaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CarParkOperations.proto.cp.CarParkToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CarParkOperations.proto.cp.carParkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new carParkServiceMethodDescriptorSupplier("setSpaces"))
                  .build();
          }
        }
     }
     return getSetSpacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CarParkOperations.proto.cp.allCarp,
      CarParkOperations.proto.cp.carParkResponse> getAllCarParksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allCarParks",
      requestType = CarParkOperations.proto.cp.allCarp.class,
      responseType = CarParkOperations.proto.cp.carParkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<CarParkOperations.proto.cp.allCarp,
      CarParkOperations.proto.cp.carParkResponse> getAllCarParksMethod() {
    io.grpc.MethodDescriptor<CarParkOperations.proto.cp.allCarp, CarParkOperations.proto.cp.carParkResponse> getAllCarParksMethod;
    if ((getAllCarParksMethod = carParkServiceGrpc.getAllCarParksMethod) == null) {
      synchronized (carParkServiceGrpc.class) {
        if ((getAllCarParksMethod = carParkServiceGrpc.getAllCarParksMethod) == null) {
          carParkServiceGrpc.getAllCarParksMethod = getAllCarParksMethod = 
              io.grpc.MethodDescriptor.<CarParkOperations.proto.cp.allCarp, CarParkOperations.proto.cp.carParkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CarParkOperations.carParkService", "allCarParks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CarParkOperations.proto.cp.allCarp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CarParkOperations.proto.cp.carParkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new carParkServiceMethodDescriptorSupplier("allCarParks"))
                  .build();
          }
        }
     }
     return getAllCarParksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static carParkServiceStub newStub(io.grpc.Channel channel) {
    return new carParkServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static carParkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new carParkServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static carParkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new carParkServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class carParkServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showStatus(CarParkOperations.proto.cp.carparkRequest request,
        io.grpc.stub.StreamObserver<CarParkOperations.proto.cp.carParkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowStatusMethod(), responseObserver);
    }

    /**
     */
    public void setFull(CarParkOperations.proto.cp.CarParkToUpdateRequest request,
        io.grpc.stub.StreamObserver<CarParkOperations.proto.cp.carParkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetFullMethod(), responseObserver);
    }

    /**
     */
    public void setSpaces(CarParkOperations.proto.cp.CarParkToUpdateRequest request,
        io.grpc.stub.StreamObserver<CarParkOperations.proto.cp.carParkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetSpacesMethod(), responseObserver);
    }

    /**
     */
    public void allCarParks(CarParkOperations.proto.cp.allCarp request,
        io.grpc.stub.StreamObserver<CarParkOperations.proto.cp.carParkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllCarParksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CarParkOperations.proto.cp.carparkRequest,
                CarParkOperations.proto.cp.carParkResponse>(
                  this, METHODID_SHOW_STATUS)))
          .addMethod(
            getSetFullMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CarParkOperations.proto.cp.CarParkToUpdateRequest,
                CarParkOperations.proto.cp.carParkResponse>(
                  this, METHODID_SET_FULL)))
          .addMethod(
            getSetSpacesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CarParkOperations.proto.cp.CarParkToUpdateRequest,
                CarParkOperations.proto.cp.carParkResponse>(
                  this, METHODID_SET_SPACES)))
          .addMethod(
            getAllCarParksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                CarParkOperations.proto.cp.allCarp,
                CarParkOperations.proto.cp.carParkResponse>(
                  this, METHODID_ALL_CAR_PARKS)))
          .build();
    }
  }

  /**
   */
  public static final class carParkServiceStub extends io.grpc.stub.AbstractStub<carParkServiceStub> {
    private carParkServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private carParkServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected carParkServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new carParkServiceStub(channel, callOptions);
    }

    /**
     */
    public void showStatus(CarParkOperations.proto.cp.carparkRequest request,
        io.grpc.stub.StreamObserver<CarParkOperations.proto.cp.carParkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setFull(CarParkOperations.proto.cp.CarParkToUpdateRequest request,
        io.grpc.stub.StreamObserver<CarParkOperations.proto.cp.carParkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetFullMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setSpaces(CarParkOperations.proto.cp.CarParkToUpdateRequest request,
        io.grpc.stub.StreamObserver<CarParkOperations.proto.cp.carParkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetSpacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allCarParks(CarParkOperations.proto.cp.allCarp request,
        io.grpc.stub.StreamObserver<CarParkOperations.proto.cp.carParkResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAllCarParksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class carParkServiceBlockingStub extends io.grpc.stub.AbstractStub<carParkServiceBlockingStub> {
    private carParkServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private carParkServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected carParkServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new carParkServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public CarParkOperations.proto.cp.carParkResponse showStatus(CarParkOperations.proto.cp.carparkRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public CarParkOperations.proto.cp.carParkResponse setFull(CarParkOperations.proto.cp.CarParkToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetFullMethod(), getCallOptions(), request);
    }

    /**
     */
    public CarParkOperations.proto.cp.carParkResponse setSpaces(CarParkOperations.proto.cp.CarParkToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetSpacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<CarParkOperations.proto.cp.carParkResponse> allCarParks(
        CarParkOperations.proto.cp.allCarp request) {
      return blockingServerStreamingCall(
          getChannel(), getAllCarParksMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class carParkServiceFutureStub extends io.grpc.stub.AbstractStub<carParkServiceFutureStub> {
    private carParkServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private carParkServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected carParkServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new carParkServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CarParkOperations.proto.cp.carParkResponse> showStatus(
        CarParkOperations.proto.cp.carparkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CarParkOperations.proto.cp.carParkResponse> setFull(
        CarParkOperations.proto.cp.CarParkToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetFullMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CarParkOperations.proto.cp.carParkResponse> setSpaces(
        CarParkOperations.proto.cp.CarParkToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetSpacesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_STATUS = 0;
  private static final int METHODID_SET_FULL = 1;
  private static final int METHODID_SET_SPACES = 2;
  private static final int METHODID_ALL_CAR_PARKS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final carParkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(carParkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_STATUS:
          serviceImpl.showStatus((CarParkOperations.proto.cp.carparkRequest) request,
              (io.grpc.stub.StreamObserver<CarParkOperations.proto.cp.carParkResponse>) responseObserver);
          break;
        case METHODID_SET_FULL:
          serviceImpl.setFull((CarParkOperations.proto.cp.CarParkToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<CarParkOperations.proto.cp.carParkResponse>) responseObserver);
          break;
        case METHODID_SET_SPACES:
          serviceImpl.setSpaces((CarParkOperations.proto.cp.CarParkToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<CarParkOperations.proto.cp.carParkResponse>) responseObserver);
          break;
        case METHODID_ALL_CAR_PARKS:
          serviceImpl.allCarParks((CarParkOperations.proto.cp.allCarp) request,
              (io.grpc.stub.StreamObserver<CarParkOperations.proto.cp.carParkResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class carParkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    carParkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CarParkOperations.proto.cp.ClassName.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("carParkService");
    }
  }

  private static final class carParkServiceFileDescriptorSupplier
      extends carParkServiceBaseDescriptorSupplier {
    carParkServiceFileDescriptorSupplier() {}
  }

  private static final class carParkServiceMethodDescriptorSupplier
      extends carParkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    carParkServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (carParkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new carParkServiceFileDescriptorSupplier())
              .addMethod(getShowStatusMethod())
              .addMethod(getSetFullMethod())
              .addMethod(getSetSpacesMethod())
              .addMethod(getAllCarParksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
