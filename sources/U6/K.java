package U6;

import U6.Q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public class K extends C1462s {
    private final Long p(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (valueOf.longValue() == 0) {
            return null;
        }
        return valueOf;
    }

    @Override // U6.C1462s, U6.AbstractC1455k
    public void a(Q source, Q target) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        AbstractC3292y.i(source, "source");
        AbstractC3292y.i(target, "target");
        try {
            Path n8 = source.n();
            Path n9 = target.n();
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(n8, n9, AbstractC1466w.a(standardCopyOption), AbstractC1466w.a(standardCopyOption2));
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e8) {
            message = e8.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // U6.C1462s, U6.AbstractC1455k
    public C1454j h(Q path) {
        AbstractC3292y.i(path, "path");
        return o(path.n());
    }

    protected final C1454j o(Path nioPath) {
        LinkOption linkOption;
        BasicFileAttributes readAttributes;
        boolean isSymbolicLink;
        Path path;
        boolean isRegularFile;
        boolean isDirectory;
        Q q8;
        long size;
        FileTime creationTime;
        Long l8;
        FileTime lastModifiedTime;
        Long l9;
        FileTime lastAccessTime;
        AbstractC3292y.i(nioPath, "nioPath");
        Long l10 = null;
        try {
            Class a9 = AbstractC1463t.a();
            linkOption = LinkOption.NOFOLLOW_LINKS;
            readAttributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) a9, linkOption);
            isSymbolicLink = readAttributes.isSymbolicLink();
            if (isSymbolicLink) {
                path = Files.readSymbolicLink(nioPath);
            } else {
                path = null;
            }
            isRegularFile = readAttributes.isRegularFile();
            isDirectory = readAttributes.isDirectory();
            if (path != null) {
                q8 = Q.a.f(Q.f10156b, path, false, 1, null);
            } else {
                q8 = null;
            }
            size = readAttributes.size();
            Long valueOf = Long.valueOf(size);
            creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l8 = p(creationTime);
            } else {
                l8 = null;
            }
            lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l9 = p(lastModifiedTime);
            } else {
                l9 = null;
            }
            lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l10 = p(lastAccessTime);
            }
            return new C1454j(isRegularFile, isDirectory, q8, valueOf, l8, l9, l10, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // U6.C1462s
    public String toString() {
        return "NioSystemFileSystem";
    }
}
