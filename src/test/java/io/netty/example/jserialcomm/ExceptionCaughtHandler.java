package io.netty.example.jserialcomm;

import com.fazecast.jSerialComm.SerialPortTimeoutException;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.jsc.JSerialCommReadTimeoutException;

public class ExceptionCaughtHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        //System.out.println("Test Exception");
        if (cause instanceof JSerialCommReadTimeoutException) {
//            System.err.println("串口读取超时");
            //超时后，定义业务需要的处理，例如可重新读取数据
        } else {
//            super.exceptionCaught(ctx, cause);
//            System.err.println(cause.getMessage());
        }
    }
}
