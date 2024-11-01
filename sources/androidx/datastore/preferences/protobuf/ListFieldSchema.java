package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@CheckReturnValue
/* loaded from: classes3.dex */
abstract class ListFieldSchema {
    private static final ListFieldSchema FULL_INSTANCE;
    private static final ListFieldSchema LITE_INSTANCE;

    /* loaded from: classes3.dex */
    private static final class ListFieldSchemaFull extends ListFieldSchema {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();

        private ListFieldSchemaFull() {
            super();
        }

        static <E> List<E> getList(Object obj, long j8) {
            return (List) UnsafeUtil.getObject(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        void makeImmutableListAt(Object obj, long j8) {
            Object unmodifiableList;
            List list = (List) UnsafeUtil.getObject(obj, j8);
            if (list instanceof LazyStringList) {
                unmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = DesugarCollections.unmodifiableList(list);
            }
            UnsafeUtil.putObject(obj, j8, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        <E> void mergeListsAt(Object obj, Object obj2, long j8) {
            List list = getList(obj2, j8);
            List mutableListAt = mutableListAt(obj, j8, list.size());
            int size = mutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                mutableListAt.addAll(list);
            }
            if (size > 0) {
                list = mutableListAt;
            }
            UnsafeUtil.putObject(obj, j8, list);
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        <L> List<L> mutableListAt(Object obj, long j8) {
            return mutableListAt(obj, j8, 10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> mutableListAt(Object obj, long j8, int i8) {
            LazyStringArrayList lazyStringArrayList;
            List<L> arrayList;
            List<L> list = getList(obj, j8);
            if (list.isEmpty()) {
                if (list instanceof LazyStringList) {
                    arrayList = new LazyStringArrayList(i8);
                } else if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    arrayList = ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i8);
                } else {
                    arrayList = new ArrayList<>(i8);
                }
                UnsafeUtil.putObject(obj, j8, arrayList);
                return arrayList;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList2 = new ArrayList(list.size() + i8);
                arrayList2.addAll(list);
                UnsafeUtil.putObject(obj, j8, arrayList2);
                lazyStringArrayList = arrayList2;
            } else if (list instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(list.size() + i8);
                lazyStringArrayList2.addAll((UnmodifiableLazyStringList) list);
                UnsafeUtil.putObject(obj, j8, lazyStringArrayList2);
                lazyStringArrayList = lazyStringArrayList2;
            } else {
                if (!(list instanceof PrimitiveNonBoxingCollection) || !(list instanceof Internal.ProtobufList)) {
                    return list;
                }
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    return list;
                }
                Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i8);
                UnsafeUtil.putObject(obj, j8, mutableCopyWithCapacity2);
                return mutableCopyWithCapacity2;
            }
            return lazyStringArrayList;
        }
    }

    /* loaded from: classes3.dex */
    private static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
            super();
        }

        static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j8) {
            return (Internal.ProtobufList) UnsafeUtil.getObject(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        void makeImmutableListAt(Object obj, long j8) {
            getProtobufList(obj, j8).makeImmutable();
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        <E> void mergeListsAt(Object obj, Object obj2, long j8) {
            Internal.ProtobufList protobufList = getProtobufList(obj, j8);
            Internal.ProtobufList protobufList2 = getProtobufList(obj2, j8);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufList.isModifiable()) {
                    protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
                }
                protobufList.addAll(protobufList2);
            }
            if (size > 0) {
                protobufList2 = protobufList;
            }
            UnsafeUtil.putObject(obj, j8, protobufList2);
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        <L> List<L> mutableListAt(Object obj, long j8) {
            int i8;
            Internal.ProtobufList protobufList = getProtobufList(obj, j8);
            if (!protobufList.isModifiable()) {
                int size = protobufList.size();
                if (size == 0) {
                    i8 = 10;
                } else {
                    i8 = size * 2;
                }
                Internal.ProtobufList mutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(i8);
                UnsafeUtil.putObject(obj, j8, mutableCopyWithCapacity2);
                return mutableCopyWithCapacity2;
            }
            return protobufList;
        }
    }

    static {
        FULL_INSTANCE = new ListFieldSchemaFull();
        LITE_INSTANCE = new ListFieldSchemaLite();
    }

    private ListFieldSchema() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ListFieldSchema full() {
        return FULL_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ListFieldSchema lite() {
        return LITE_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void makeImmutableListAt(Object obj, long j8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> mutableListAt(Object obj, long j8);
}
