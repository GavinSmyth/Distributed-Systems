package HeatingDevice.proto.h;

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
    comments = "Source: HeatingDevice.proto")
public final class HeaterServiceGrpc {

  private HeaterServiceGrpc() {}

  public static final String SERVICE_NAME = "HeatingDevice.HeaterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterStatusRequest,
      HeatingDevice.proto.h.HeaterStatusResponse> getShowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showStatus",
      requestType = HeatingDevice.proto.h.HeaterStatusRequest.class,
      responseType = HeatingDevice.proto.h.HeaterStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterStatusRequest,
      HeatingDevice.proto.h.HeaterStatusResponse> getShowStatusMethod() {
    io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterStatusRequest, HeatingDevice.proto.h.HeaterStatusResponse> getShowStatusMethod;
    if ((getShowStatusMethod = HeaterServiceGrpc.getShowStatusMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getShowStatusMethod = HeaterServiceGrpc.getShowStatusMethod) == null) {
          HeaterServiceGrpc.getShowStatusMethod = getShowStatusMethod = 
              io.grpc.MethodDescriptor.<HeatingDevice.proto.h.HeaterStatusRequest, HeatingDevice.proto.h.HeaterStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeatingDevice.HeaterService", "showStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingDevice.proto.h.HeaterStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingDevice.proto.h.HeaterStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("showStatus"))
                  .build();
          }
        }
     }
     return getShowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterUpdateRequest,
      HeatingDevice.proto.h.HeaterDetailResponse> getSetTempatureHighMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setTempatureHigh",
      requestType = HeatingDevice.proto.h.HeaterUpdateRequest.class,
      responseType = HeatingDevice.proto.h.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterUpdateRequest,
      HeatingDevice.proto.h.HeaterDetailResponse> getSetTempatureHighMethod() {
    io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterUpdateRequest, HeatingDevice.proto.h.HeaterDetailResponse> getSetTempatureHighMethod;
    if ((getSetTempatureHighMethod = HeaterServiceGrpc.getSetTempatureHighMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetTempatureHighMethod = HeaterServiceGrpc.getSetTempatureHighMethod) == null) {
          HeaterServiceGrpc.getSetTempatureHighMethod = getSetTempatureHighMethod = 
              io.grpc.MethodDescriptor.<HeatingDevice.proto.h.HeaterUpdateRequest, HeatingDevice.proto.h.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeatingDevice.HeaterService", "setTempatureHigh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingDevice.proto.h.HeaterUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingDevice.proto.h.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("setTempatureHigh"))
                  .build();
          }
        }
     }
     return getSetTempatureHighMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterUpdateRequest,
      HeatingDevice.proto.h.HeaterDetailResponse> getSetTempaturelowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setTempaturelow",
      requestType = HeatingDevice.proto.h.HeaterUpdateRequest.class,
      responseType = HeatingDevice.proto.h.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterUpdateRequest,
      HeatingDevice.proto.h.HeaterDetailResponse> getSetTempaturelowMethod() {
    io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterUpdateRequest, HeatingDevice.proto.h.HeaterDetailResponse> getSetTempaturelowMethod;
    if ((getSetTempaturelowMethod = HeaterServiceGrpc.getSetTempaturelowMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetTempaturelowMethod = HeaterServiceGrpc.getSetTempaturelowMethod) == null) {
          HeaterServiceGrpc.getSetTempaturelowMethod = getSetTempaturelowMethod = 
              io.grpc.MethodDescriptor.<HeatingDevice.proto.h.HeaterUpdateRequest, HeatingDevice.proto.h.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeatingDevice.HeaterService", "setTempaturelow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingDevice.proto.h.HeaterUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingDevice.proto.h.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("setTempaturelow"))
                  .build();
          }
        }
     }
     return getSetTempaturelowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HeatingDevice.proto.h.exact_temp,
      HeatingDevice.proto.h.HeaterDetailResponse> getSetExactTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setExactTemp",
      requestType = HeatingDevice.proto.h.exact_temp.class,
      responseType = HeatingDevice.proto.h.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HeatingDevice.proto.h.exact_temp,
      HeatingDevice.proto.h.HeaterDetailResponse> getSetExactTempMethod() {
    io.grpc.MethodDescriptor<HeatingDevice.proto.h.exact_temp, HeatingDevice.proto.h.HeaterDetailResponse> getSetExactTempMethod;
    if ((getSetExactTempMethod = HeaterServiceGrpc.getSetExactTempMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetExactTempMethod = HeaterServiceGrpc.getSetExactTempMethod) == null) {
          HeaterServiceGrpc.getSetExactTempMethod = getSetExactTempMethod = 
              io.grpc.MethodDescriptor.<HeatingDevice.proto.h.exact_temp, HeatingDevice.proto.h.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeatingDevice.HeaterService", "setExactTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingDevice.proto.h.exact_temp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingDevice.proto.h.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("setExactTemp"))
                  .build();
          }
        }
     }
     return getSetExactTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterUpdateRequest,
      HeatingDevice.proto.h.HeaterDetailResponse> getSetOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setOff",
      requestType = HeatingDevice.proto.h.HeaterUpdateRequest.class,
      responseType = HeatingDevice.proto.h.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterUpdateRequest,
      HeatingDevice.proto.h.HeaterDetailResponse> getSetOffMethod() {
    io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterUpdateRequest, HeatingDevice.proto.h.HeaterDetailResponse> getSetOffMethod;
    if ((getSetOffMethod = HeaterServiceGrpc.getSetOffMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetOffMethod = HeaterServiceGrpc.getSetOffMethod) == null) {
          HeaterServiceGrpc.getSetOffMethod = getSetOffMethod = 
              io.grpc.MethodDescriptor.<HeatingDevice.proto.h.HeaterUpdateRequest, HeatingDevice.proto.h.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeatingDevice.HeaterService", "setOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingDevice.proto.h.HeaterUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingDevice.proto.h.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("setOff"))
                  .build();
          }
        }
     }
     return getSetOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterUpdateRequest,
      HeatingDevice.proto.h.HeaterDetailResponse> getSetOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setOn",
      requestType = HeatingDevice.proto.h.HeaterUpdateRequest.class,
      responseType = HeatingDevice.proto.h.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterUpdateRequest,
      HeatingDevice.proto.h.HeaterDetailResponse> getSetOnMethod() {
    io.grpc.MethodDescriptor<HeatingDevice.proto.h.HeaterUpdateRequest, HeatingDevice.proto.h.HeaterDetailResponse> getSetOnMethod;
    if ((getSetOnMethod = HeaterServiceGrpc.getSetOnMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetOnMethod = HeaterServiceGrpc.getSetOnMethod) == null) {
          HeaterServiceGrpc.getSetOnMethod = getSetOnMethod = 
              io.grpc.MethodDescriptor.<HeatingDevice.proto.h.HeaterUpdateRequest, HeatingDevice.proto.h.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeatingDevice.HeaterService", "setOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingDevice.proto.h.HeaterUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingDevice.proto.h.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("setOn"))
                  .build();
          }
        }
     }
     return getSetOnMethod;
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
    public void showStatus(HeatingDevice.proto.h.HeaterStatusRequest request,
        io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowStatusMethod(), responseObserver);
    }

    /**
     */
    public void setTempatureHigh(HeatingDevice.proto.h.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTempatureHighMethod(), responseObserver);
    }

    /**
     */
    public void setTempaturelow(HeatingDevice.proto.h.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTempaturelowMethod(), responseObserver);
    }

    /**
     */
    public void setExactTemp(HeatingDevice.proto.h.exact_temp request,
        io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetExactTempMethod(), responseObserver);
    }

    /**
     */
    public void setOff(HeatingDevice.proto.h.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOffMethod(), responseObserver);
    }

    /**
     */
    public void setOn(HeatingDevice.proto.h.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOnMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HeatingDevice.proto.h.HeaterStatusRequest,
                HeatingDevice.proto.h.HeaterStatusResponse>(
                  this, METHODID_SHOW_STATUS)))
          .addMethod(
            getSetTempatureHighMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HeatingDevice.proto.h.HeaterUpdateRequest,
                HeatingDevice.proto.h.HeaterDetailResponse>(
                  this, METHODID_SET_TEMPATURE_HIGH)))
          .addMethod(
            getSetTempaturelowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HeatingDevice.proto.h.HeaterUpdateRequest,
                HeatingDevice.proto.h.HeaterDetailResponse>(
                  this, METHODID_SET_TEMPATURELOW)))
          .addMethod(
            getSetExactTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HeatingDevice.proto.h.exact_temp,
                HeatingDevice.proto.h.HeaterDetailResponse>(
                  this, METHODID_SET_EXACT_TEMP)))
          .addMethod(
            getSetOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HeatingDevice.proto.h.HeaterUpdateRequest,
                HeatingDevice.proto.h.HeaterDetailResponse>(
                  this, METHODID_SET_OFF)))
          .addMethod(
            getSetOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HeatingDevice.proto.h.HeaterUpdateRequest,
                HeatingDevice.proto.h.HeaterDetailResponse>(
                  this, METHODID_SET_ON)))
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
    public void showStatus(HeatingDevice.proto.h.HeaterStatusRequest request,
        io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTempatureHigh(HeatingDevice.proto.h.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTempatureHighMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTempaturelow(HeatingDevice.proto.h.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTempaturelowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setExactTemp(HeatingDevice.proto.h.exact_temp request,
        io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetExactTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOff(HeatingDevice.proto.h.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOn(HeatingDevice.proto.h.HeaterUpdateRequest request,
        io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOnMethod(), getCallOptions()), request, responseObserver);
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
    public HeatingDevice.proto.h.HeaterStatusResponse showStatus(HeatingDevice.proto.h.HeaterStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public HeatingDevice.proto.h.HeaterDetailResponse setTempatureHigh(HeatingDevice.proto.h.HeaterUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTempatureHighMethod(), getCallOptions(), request);
    }

    /**
     */
    public HeatingDevice.proto.h.HeaterDetailResponse setTempaturelow(HeatingDevice.proto.h.HeaterUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTempaturelowMethod(), getCallOptions(), request);
    }

    /**
     */
    public HeatingDevice.proto.h.HeaterDetailResponse setExactTemp(HeatingDevice.proto.h.exact_temp request) {
      return blockingUnaryCall(
          getChannel(), getSetExactTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public HeatingDevice.proto.h.HeaterDetailResponse setOff(HeatingDevice.proto.h.HeaterUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public HeatingDevice.proto.h.HeaterDetailResponse setOn(HeatingDevice.proto.h.HeaterUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetOnMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<HeatingDevice.proto.h.HeaterStatusResponse> showStatus(
        HeatingDevice.proto.h.HeaterStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HeatingDevice.proto.h.HeaterDetailResponse> setTempatureHigh(
        HeatingDevice.proto.h.HeaterUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTempatureHighMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HeatingDevice.proto.h.HeaterDetailResponse> setTempaturelow(
        HeatingDevice.proto.h.HeaterUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTempaturelowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HeatingDevice.proto.h.HeaterDetailResponse> setExactTemp(
        HeatingDevice.proto.h.exact_temp request) {
      return futureUnaryCall(
          getChannel().newCall(getSetExactTempMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HeatingDevice.proto.h.HeaterDetailResponse> setOff(
        HeatingDevice.proto.h.HeaterUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HeatingDevice.proto.h.HeaterDetailResponse> setOn(
        HeatingDevice.proto.h.HeaterUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOnMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_STATUS = 0;
  private static final int METHODID_SET_TEMPATURE_HIGH = 1;
  private static final int METHODID_SET_TEMPATURELOW = 2;
  private static final int METHODID_SET_EXACT_TEMP = 3;
  private static final int METHODID_SET_OFF = 4;
  private static final int METHODID_SET_ON = 5;

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
          serviceImpl.showStatus((HeatingDevice.proto.h.HeaterStatusRequest) request,
              (io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterStatusResponse>) responseObserver);
          break;
        case METHODID_SET_TEMPATURE_HIGH:
          serviceImpl.setTempatureHigh((HeatingDevice.proto.h.HeaterUpdateRequest) request,
              (io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse>) responseObserver);
          break;
        case METHODID_SET_TEMPATURELOW:
          serviceImpl.setTempaturelow((HeatingDevice.proto.h.HeaterUpdateRequest) request,
              (io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse>) responseObserver);
          break;
        case METHODID_SET_EXACT_TEMP:
          serviceImpl.setExactTemp((HeatingDevice.proto.h.exact_temp) request,
              (io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse>) responseObserver);
          break;
        case METHODID_SET_OFF:
          serviceImpl.setOff((HeatingDevice.proto.h.HeaterUpdateRequest) request,
              (io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse>) responseObserver);
          break;
        case METHODID_SET_ON:
          serviceImpl.setOn((HeatingDevice.proto.h.HeaterUpdateRequest) request,
              (io.grpc.stub.StreamObserver<HeatingDevice.proto.h.HeaterDetailResponse>) responseObserver);
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
      return HeatingDevice.proto.h.ClassName.getDescriptor();
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
              .addMethod(getSetTempatureHighMethod())
              .addMethod(getSetTempaturelowMethod())
              .addMethod(getSetExactTempMethod())
              .addMethod(getSetOffMethod())
              .addMethod(getSetOnMethod())
              .build();
        }
      }
    }
    return result;
  }
}
