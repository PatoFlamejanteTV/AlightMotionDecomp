package m2;

import java.io.PrintWriter;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f34996a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34997b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34998c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34999d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35000e;

    /* renamed from: f, reason: collision with root package name */
    public final long f35001f;

    /* renamed from: g, reason: collision with root package name */
    public final long f35002g;

    /* renamed from: h, reason: collision with root package name */
    public final long f35003h;

    /* renamed from: i, reason: collision with root package name */
    public final long f35004i;

    /* renamed from: j, reason: collision with root package name */
    public final long f35005j;

    /* renamed from: k, reason: collision with root package name */
    public final int f35006k;

    /* renamed from: l, reason: collision with root package name */
    public final int f35007l;

    /* renamed from: m, reason: collision with root package name */
    public final int f35008m;

    /* renamed from: n, reason: collision with root package name */
    public final long f35009n;

    public d(int i8, int i9, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, int i10, int i11, int i12, long j16) {
        this.f34996a = i8;
        this.f34997b = i9;
        this.f34998c = j8;
        this.f34999d = j9;
        this.f35000e = j10;
        this.f35001f = j11;
        this.f35002g = j12;
        this.f35003h = j13;
        this.f35004i = j14;
        this.f35005j = j15;
        this.f35006k = i10;
        this.f35007l = i11;
        this.f35008m = i12;
        this.f35009n = j16;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f34996a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f34997b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f34997b / this.f34996a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f34998c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f34999d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f35006k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f35000e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f35003h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f35007l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f35001f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f35008m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f35002g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f35004i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f35005j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f34996a + ", size=" + this.f34997b + ", cacheHits=" + this.f34998c + ", cacheMisses=" + this.f34999d + ", downloadCount=" + this.f35006k + ", totalDownloadSize=" + this.f35000e + ", averageDownloadSize=" + this.f35003h + ", totalOriginalBitmapSize=" + this.f35001f + ", totalTransformedBitmapSize=" + this.f35002g + ", averageOriginalBitmapSize=" + this.f35004i + ", averageTransformedBitmapSize=" + this.f35005j + ", originalBitmapCount=" + this.f35007l + ", transformedBitmapCount=" + this.f35008m + ", timeStamp=" + this.f35009n + '}';
    }
}
