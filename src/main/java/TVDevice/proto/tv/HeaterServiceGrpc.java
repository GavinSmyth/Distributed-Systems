package TVDevice.proto.tv;

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
    comments = "Source: TVDevice.proto")
public final class HeaterServiceGrpc {

  private HeaterServiceGrpc() {}

  public static final String SERVICE_NAME = "TVDevice.HeaterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<TVDevice.proto.tv.TVStatusRequest,
      TVDevice.proto.tv.TVStatusResponse> getShowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowStatus",
      requestType = TVDevice.proto.tv.TVStatusRequest.class,
      responseType = TVDevice.proto.tv.TVStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TVDevice.proto.tv.TVStatusRequest,
      TVDevice.proto.tv.TVStatusResponse> getShowStatusMethod() {
    io.grpc.MethodDescriptor<TVDevice.proto.tv.TVStatusRequest, TVDevice.proto.tv.TVStatusResponse> getShowStatusMethod;
    if ((getShowStatusMethod = HeaterServiceGrpc.getShowStatusMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getShowStatusMethod = HeaterServiceGrpc.getShowStatusMethod) == null) {
          HeaterServiceGrpc.getShowStatusMethod = getShowStatusMethod = 
              io.grpc.MethodDescriptor.<TVDevice.proto.tv.TVStatusRequest, TVDevice.proto.tv.TVStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TVDevice.HeaterService", "ShowStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TVDevice.proto.tv.TVStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TVDevice.proto.tv.TVStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("ShowStatus"))
                  .build();
          }
        }
     }
     return getShowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TVDevice.proto.tv.exact_update,
      TVDevice.proto.tv.TVDetailResponse> getSetExactVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetExactVolume",
      requestType = TVDevice.proto.tv.exact_update.class,
      responseType = TVDevice.proto.tv.TVDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TVDevice.proto.tv.exact_update,
      TVDevice.proto.tv.TVDetailResponse> getSetExactVolumeMethod() {
    io.grpc.MethodDescriptor<TVDevice.proto.tv.exact_update, TVDevice.proto.tv.TVDetailResponse> getSetExactVolumeMethod;
    if ((getSetExactVolumeMethod = HeaterServiceGrpc.getSetExactVolumeMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetExactVolumeMethod = HeaterServiceGrpc.getSetExactVolumeMethod) == null) {
          HeaterServiceGrpc.getSetExactVolumeMethod = getSetExactVolumeMethod = 
              io.grpc.MethodDescriptor.<TVDevice.proto.tv.exact_update, TVDevice.proto.tv.TVDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TVDevice.HeaterService", "SetExactVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TVDevice.proto.tv.exact_update.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TVDevice.proto.tv.TVDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("SetExactVolume"))
                  .build();
          }
        }
     }
     return getSetExactVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TVDevice.proto.tv.update_request,
      TVDevice.proto.tv.TVDetailResponse> getTVOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TVOn",
      requestType = TVDevice.proto.tv.update_request.class,
      responseType = TVDevice.proto.tv.TVDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TVDevice.proto.tv.update_request,
      TVDevice.proto.tv.TVDetailResponse> getTVOnMethod() {
    io.grpc.MethodDescriptor<TVDevice.proto.tv.update_request, TVDevice.proto.tv.TVDetailResponse> getTVOnMethod;
    if ((getTVOnMethod = HeaterServiceGrpc.getTVOnMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getTVOnMethod = HeaterServiceGrpc.getTVOnMethod) == null) {
          HeaterServiceGrpc.getTVOnMethod = getTVOnMethod = 
              io.grpc.MethodDescriptor.<TVDevice.proto.tv.update_request, TVDevice.proto.tv.TVDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TVDevice.HeaterService", "TVOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TVDevice.proto.tv.update_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TVDevice.proto.tv.TVDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("TVOn"))
                  .build();
          }
        }
     }
     return getTVOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TVDevice.proto.tv.update_request,
      TVDevice.proto.tv.TVDetailResponse> getTVOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TVOff",
      requestType = TVDevice.proto.tv.update_request.class,
      responseType = TVDevice.proto.tv.TVDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TVDevice.proto.tv.update_request,
      TVDevice.proto.tv.TVDetailResponse> getTVOffMethod() {
    io.grpc.MethodDescriptor<TVDevice.proto.tv.update_request, TVDevice.proto.tv.TVDetailResponse> getTVOffMethod;
    if ((getTVOffMethod = HeaterServiceGrpc.getTVOffMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getTVOffMethod = HeaterServiceGrpc.getTVOffMethod) == null) {
          HeaterServiceGrpc.getTVOffMethod = getTVOffMethod = 
              io.grpc.MethodDescriptor.<TVDevice.proto.tv.update_request, TVDevice.proto.tv.TVDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TVDevice.HeaterService", "TVOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TVDevice.proto.tv.update_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TVDevice.proto.tv.TVDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("TVOff"))
                  .build();
          }
        }
     }
     return getTVOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeaterServiceStub newStub(io.grpc.Channel channel) {
    return new HeaterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeaterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeaterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeaterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeaterServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HeaterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showStatus(TVDevice.proto.tv.TVStatusRequest request,
        io.grpc.stub.StreamObserver<TVDevice.proto.tv.TVStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowStatusMethod(), responseObserver);
    }

    /**
     */
    public void setExactVolume(TVDevice.proto.tv.exact_update request,
        io.grpc.stub.StreamObserver<TVDevice.proto.tv.TVDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetExactVolumeMethod(), responseObserver);
    }

    /**
     */
    public void tVOn(TVDevice.proto.tv.update_request request,
        io.grpc.stub.StreamObserver<TVDevice.proto.tv.TVDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTVOnMethod(), responseObserver);
    }

    /**
     */
    public void tVOff(TVDevice.proto.tv.update_request request,
        io.grpc.stub.StreamObserver<TVDevice.proto.tv.TVDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTVOffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                TVDevice.proto.tv.TVStatusRequest,
                TVDevice.proto.tv.TVStatusResponse>(
                  this, METHODID_SHOW_STATUS)))
          .addMethod(
            getSetExactVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                TVDevice.proto.tv.exact_update,
                TVDevice.proto.tv.TVDetailResponse>(
                  this, METHODID_SET_EXACT_VOLUME)))
          .addMethod(
            getTVOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                TVDevice.proto.tv.update_request,
                TVDevice.proto.tv.TVDetailResponse>(
                  this, METHODID_TVON)))
          .addMethod(
            getTVOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                TVDevice.proto.tv.update_request,
                TVDevice.proto.tv.TVDetailResponse>(
                  this, METHODID_TVOFF)))
          .build();
    }
  }

  /**
   */
  public static final class HeaterServiceStub extends io.grpc.stub.AbstractStub<HeaterServiceStub> {
    private HeaterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeaterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeaterServiceStub(channel, callOptions);
    }

    /**
     */
    public void showStatus(TVDevice.proto.tv.TVStatusRequest request,
        io.grpc.stub.StreamObserver<TVDevice.proto.tv.TVStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setExactVolume(TVDevice.proto.tv.exact_update request,
        io.grpc.stub.StreamObserver<TVDevice.proto.tv.TVDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetExactVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tVOn(TVDevice.proto.tv.update_request request,
        io.grpc.stub.StreamObserver<TVDevice.proto.tv.TVDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTVOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tVOff(TVDevice.proto.tv.update_request request,
        io.grpc.stub.StreamObserver<TVDevice.proto.tv.TVDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTVOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeaterServiceBlockingStub extends io.grpc.stub.AbstractStub<HeaterServiceBlockingStub> {
    private HeaterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeaterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeaterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public TVDevice.proto.tv.TVStatusResponse showStatus(TVDevice.proto.tv.TVStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public TVDevice.proto.tv.TVDetailResponse setExactVolume(TVDevice.proto.tv.exact_update request) {
      return blockingUnaryCall(
          getChannel(), getSetExactVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public TVDevice.proto.tv.TVDetailResponse tVOn(TVDevice.proto.tv.update_request request) {
      return blockingUnaryCall(
          getChannel(), getTVOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public TVDevice.proto.tv.TVDetailResponse tVOff(TVDevice.proto.tv.update_request request) {
      return blockingUnaryCall(
          getChannel(), getTVOffMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeaterServiceFutureStub extends io.grpc.stub.AbstractStub<HeaterServiceFutureStub> {
    private HeaterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeaterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeaterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TVDevice.proto.tv.TVStatusResponse> showStatus(
        TVDevice.proto.tv.TVStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TVDevice.proto.tv.TVDetailResponse> setExactVolume(
        TVDevice.proto.tv.exact_update request) {
      return futureUnaryCall(
          getChannel().newCall(getSetExactVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TVDevice.proto.tv.TVDetailResponse> tVOn(
        TVDevice.proto.tv.update_request request) {
      return futureUnaryCall(
          getChannel().newCall(getTVOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TVDevice.proto.tv.TVDetailResponse> tVOff(
        TVDevice.proto.tv.update_request request) {
      return futureUnaryCall(
          getChannel().newCall(getTVOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_STATUS = 0;
  private static final int METHODID_SET_EXACT_VOLUME = 1;
  private static final int METHODID_TVON = 2;
  private static final int METHODID_TVOFF = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeaterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeaterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_STATUS:
          serviceImpl.showStatus((TVDevice.proto.tv.TVStatusRequest) request,
              (io.grpc.stub.StreamObserver<TVDevice.proto.tv.TVStatusResponse>) responseObserver);
          break;
        case METHODID_SET_EXACT_VOLUME:
          serviceImpl.setExactVolume((TVDevice.proto.tv.exact_update) request,
              (io.grpc.stub.StreamObserver<TVDevice.proto.tv.TVDetailResponse>) responseObserver);
          break;
        case METHODID_TVON:
          serviceImpl.tVOn((TVDevice.proto.tv.update_request) request,
              (io.grpc.stub.StreamObserver<TVDevice.proto.tv.TVDetailResponse>) responseObserver);
          break;
        case METHODID_TVOFF:
          serviceImpl.tVOff((TVDevice.proto.tv.update_request) request,
              (io.grpc.stub.StreamObserver<TVDevice.proto.tv.TVDetailResponse>) responseObserver);
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

  private static abstract class HeaterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeaterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return TVDevice.proto.tv.ClassName.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeaterService");
    }
  }

  private static final class HeaterServiceFileDescriptorSupplier
      extends HeaterServiceBaseDescriptorSupplier {
    HeaterServiceFileDescriptorSupplier() {}
  }

  private static final class HeaterServiceMethodDescriptorSupplier
      extends HeaterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeaterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeaterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeaterServiceFileDescriptorSupplier())
              .addMethod(getShowStatusMethod())
              .addMethod(getSetExactVolumeMethod())
              .addMethod(getTVOnMethod())
              .addMethod(getTVOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
