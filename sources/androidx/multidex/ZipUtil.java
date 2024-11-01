package androidx.multidex;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* loaded from: classes3.dex */
final class ZipUtil {
    private static final int BUFFER_SIZE = 16384;
    private static final int ENDHDR = 22;
    private static final int ENDSIG = 101010256;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class CentralDirectory {
        long offset;
        long size;

        CentralDirectory() {
        }
    }

    ZipUtil() {
    }

    static long computeCrcOfCentralDir(RandomAccessFile randomAccessFile, CentralDirectory centralDirectory) throws IOException {
        CRC32 crc32 = new CRC32();
        long j8 = centralDirectory.size;
        randomAccessFile.seek(centralDirectory.offset);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j8));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j8 -= read;
            if (j8 == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j8));
        }
        return crc32.getValue();
    }

    static CentralDirectory findCentralDirectory(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length();
        long j8 = length - 22;
        long j9 = 0;
        if (j8 >= 0) {
            long j10 = length - 65558;
            if (j10 >= 0) {
                j9 = j10;
            }
            int reverseBytes = Integer.reverseBytes(ENDSIG);
            do {
                randomAccessFile.seek(j8);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    CentralDirectory centralDirectory = new CentralDirectory();
                    centralDirectory.size = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    centralDirectory.offset = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    return centralDirectory;
                }
                j8--;
            } while (j8 >= j9);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getZipCrc(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
        try {
            return computeCrcOfCentralDir(randomAccessFile, findCentralDirectory(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
