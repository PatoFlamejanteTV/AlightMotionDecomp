package com.mbridge.msdk.thrid.okhttp.internal.ws;

import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.ByteString;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
final class WebSocketReader {
    boolean closed;
    final FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    int opcode;
    final BufferedSource source;
    private final Buffer controlFrameBuffer = new Buffer();
    private final Buffer messageFrameBuffer = new Buffer();

    /* loaded from: classes4.dex */
    public interface FrameCallback {
        void onReadClose(int i8, String str);

        void onReadMessage(ByteString byteString) throws IOException;

        void onReadMessage(String str) throws IOException;

        void onReadPing(ByteString byteString);

        void onReadPong(ByteString byteString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketReader(boolean z8, BufferedSource bufferedSource, FrameCallback frameCallback) {
        byte[] bArr;
        if (bufferedSource != null) {
            if (frameCallback != null) {
                this.isClient = z8;
                this.source = bufferedSource;
                this.frameCallback = frameCallback;
                if (z8) {
                    bArr = null;
                } else {
                    bArr = new byte[4];
                }
                this.maskKey = bArr;
                this.maskCursor = z8 ? null : new Buffer.UnsafeCursor();
                return;
            }
            throw new NullPointerException("frameCallback == null");
        }
        throw new NullPointerException("source == null");
    }

    private void readControlFrame() throws IOException {
        short s8;
        String str;
        long j8 = this.frameLength;
        if (j8 > 0) {
            this.source.readFully(this.controlFrameBuffer, j8);
            if (!this.isClient) {
                this.controlFrameBuffer.readAndWriteUnsafe(this.maskCursor);
                this.maskCursor.seek(0L);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                long size = this.controlFrameBuffer.size();
                if (size != 1) {
                    if (size != 0) {
                        s8 = this.controlFrameBuffer.readShort();
                        str = this.controlFrameBuffer.readUtf8();
                        String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s8);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        s8 = 1005;
                        str = "";
                    }
                    this.frameCallback.onReadClose(s8, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.readByteString());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.opcode));
        }
    }

    private void readHeader() throws IOException {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                byte readByte = this.source.readByte();
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.opcode = readByte & 15;
                boolean z13 = false;
                if ((readByte & 128) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.isFinalFrame = z8;
                if ((readByte & 8) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.isControlFrame = z9;
                if (z9 && !z8) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((readByte & 64) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((readByte & 32) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((readByte & 16) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z10 && !z11 && !z12) {
                    byte readByte2 = this.source.readByte();
                    if ((readByte2 & 128) != 0) {
                        z13 = true;
                    }
                    if (z13 == this.isClient) {
                        if (this.isClient) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    long j8 = readByte2 & Byte.MAX_VALUE;
                    this.frameLength = j8;
                    if (j8 == 126) {
                        this.frameLength = this.source.readShort() & 65535;
                    } else if (j8 == 127) {
                        long readLong = this.source.readLong();
                        this.frameLength = readLong;
                        if (readLong < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    }
                    if (z13) {
                        this.source.readFully(this.maskKey);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("Reserved flags are unsupported.");
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    private void readMessage() throws IOException {
        while (!this.closed) {
            long j8 = this.frameLength;
            if (j8 > 0) {
                this.source.readFully(this.messageFrameBuffer, j8);
                if (!this.isClient) {
                    this.messageFrameBuffer.readAndWriteUnsafe(this.maskCursor);
                    this.maskCursor.seek(this.messageFrameBuffer.size() - this.frameLength);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private void readMessageFrame() throws IOException {
        int i8 = this.opcode;
        if (i8 != 1 && i8 != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i8));
        }
        readMessage();
        if (i8 == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.readUtf8());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.readByteString());
        }
    }

    private void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
