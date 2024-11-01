package com.mbridge.msdk.foundation.same.net.g;

/* loaded from: classes4.dex */
public final class a {
    public static String a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        int i8;
        if (aVar == null) {
            return "Network error,Load failed";
        }
        try {
            int i9 = aVar.f20840a;
            com.mbridge.msdk.foundation.same.net.f.c cVar = aVar.f20842c;
            if (cVar != null) {
                i8 = cVar.f20897d;
            } else {
                i8 = 0;
            }
            if (i9 != -2) {
                if (i9 != 15) {
                    if (i9 != 880023) {
                        if (i9 != 880041) {
                            switch (i9) {
                                case 1:
                                    return "Network error,Load failed";
                                case 2:
                                    return "Network error,I/O exception";
                                case 3:
                                    return "Network error,timeout exception";
                                case 4:
                                    return "Network unknown error";
                                case 5:
                                    return "Network error，https is not work,please check your phone time";
                                case 6:
                                    if (i8 != 0) {
                                        return "Network error,please check state code " + i8;
                                    }
                                    return "Network error,please check ";
                                case 7:
                                    if (i8 != 0) {
                                        return "The server returns an exception state code " + i8;
                                    }
                                    return "The server returns an exception ";
                                case 8:
                                    return "Cast exception, return data can not be casted correctly";
                                default:
                                    switch (i9) {
                                        case 10:
                                            return "Network error,socket timeout exception";
                                        case 11:
                                            return "Network error，sslp exception";
                                        case 12:
                                            return "Network error,ConnectException";
                                        case 13:
                                            if (cVar != null) {
                                                byte[] bArr = cVar.f20894a;
                                                if (bArr != null) {
                                                    return new String(bArr);
                                                }
                                                return "Socket exception message is NULL";
                                            }
                                            return "Unknown socket exception";
                                        default:
                                            return "Network error,unknown";
                                    }
                            }
                        }
                        return "Network error,UnknownHostException";
                    }
                    return "timeout";
                }
                return "Network error,I/O exception contents null";
            }
            return "Network is canceled";
        } catch (Exception e8) {
            e8.printStackTrace();
            return "Network error,Load failed";
        }
    }
}
