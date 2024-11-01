package N7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes5.dex */
public class c implements l {

    /* renamed from: c, reason: collision with root package name */
    private static final String f6877c = M7.b.i(c.class);

    /* renamed from: a, reason: collision with root package name */
    private long f6878a = 5000;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6879b = false;

    private static boolean d(int i8) {
        if (i8 != 204 && i8 != 200) {
            return false;
        }
        return true;
    }

    @Override // N7.l
    public void a(long j8) {
        this.f6878a = j8;
    }

    @Override // N7.l
    public void b(boolean z8) {
        this.f6879b = z8;
    }

    @Override // N7.l
    public boolean c(j jVar) {
        BufferedWriter bufferedWriter;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection = null;
        OutputStream outputStream2 = null;
        BufferedWriter bufferedWriter2 = null;
        BufferedReader bufferedReader = null;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(jVar.c()).openConnection();
                try {
                    String str = f6877c;
                    V7.a.b(str).g("Connection is open to %s", httpURLConnection3.getURL().toExternalForm());
                    V7.a.b(str).g("Sending: %s", jVar);
                    httpURLConnection3.setConnectTimeout((int) this.f6878a);
                    httpURLConnection3.setReadTimeout((int) this.f6878a);
                    if (jVar.b() != null) {
                        httpURLConnection3.setDoOutput(true);
                        httpURLConnection3.setRequestProperty("Content-Type", "application/json");
                        httpURLConnection3.setRequestProperty("charset", "utf-8");
                        String jSONObject = jVar.b().toString();
                        if (this.f6879b) {
                            httpURLConnection3.addRequestProperty("Content-Encoding", "gzip");
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject.getBytes(StandardCharsets.UTF_8));
                                gZIPOutputStream.close();
                                try {
                                    outputStream = httpURLConnection3.getOutputStream();
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    outputStream.write(byteArrayOutputStream.toByteArray());
                                    try {
                                        outputStream.close();
                                    } catch (IOException e8) {
                                        V7.a.b(f6877c).b(e8, "Failed to close output stream after writing gzipped POST data.", new Object[0]);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    outputStream2 = outputStream;
                                    if (outputStream2 != null) {
                                        try {
                                            outputStream2.close();
                                        } catch (IOException e9) {
                                            V7.a.b(f6877c).b(e9, "Failed to close output stream after writing gzipped POST data.", new Object[0]);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } else {
                            try {
                                bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection3.getOutputStream(), StandardCharsets.UTF_8));
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            try {
                                bufferedWriter.write(jSONObject);
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e10) {
                                    V7.a.b(f6877c).b(e10, "Failed to close output stream after writing POST data.", new Object[0]);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                bufferedWriter2 = bufferedWriter;
                                if (bufferedWriter2 != null) {
                                    try {
                                        bufferedWriter2.close();
                                    } catch (IOException e11) {
                                        V7.a.b(f6877c).b(e11, "Failed to close output stream after writing POST data.", new Object[0]);
                                    }
                                }
                                throw th;
                            }
                        }
                    } else {
                        httpURLConnection3.setDoOutput(false);
                    }
                    int responseCode = httpURLConnection3.getResponseCode();
                    V7.a.b(f6877c).g("Transmission finished (code=%d).", Integer.valueOf(responseCode));
                    boolean d8 = d(responseCode);
                    if (d8) {
                        InputStream inputStream = httpURLConnection3.getInputStream();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e12) {
                                V7.a.b(f6877c).b(e12, "Failed to close the error stream.", new Object[0]);
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection3.getErrorStream()));
                            while (true) {
                                try {
                                    String readLine = bufferedReader2.readLine();
                                    if (readLine != null) {
                                        sb.append(readLine);
                                    } else {
                                        try {
                                            break;
                                        } catch (IOException e13) {
                                            V7.a.b(f6877c).b(e13, "Failed to close the error stream.", new Object[0]);
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e14) {
                                            V7.a.b(f6877c).b(e14, "Failed to close the error stream.", new Object[0]);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            bufferedReader2.close();
                            V7.a.b(f6877c).h("Transmission failed (code=%d, reason=%s)", Integer.valueOf(responseCode), sb.toString());
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    }
                    httpURLConnection3.disconnect();
                    return d8;
                } catch (Exception e15) {
                    e = e15;
                    httpURLConnection = httpURLConnection3;
                    V7.a.b(f6877c).e(e, "Transmission failed unexpectedly.", new Object[0]);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return false;
                } catch (Throwable th9) {
                    th = th9;
                    httpURLConnection2 = httpURLConnection3;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e16) {
                e = e16;
            }
        } catch (Throwable th10) {
            th = th10;
        }
    }
}
