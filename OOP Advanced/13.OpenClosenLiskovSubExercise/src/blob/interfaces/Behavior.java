package blob.interfaces;

import blob.models.BlobImpl;

public interface Behavior {
    void trigger(BlobImpl source);
    void applyRecurrentEffect(BlobImpl source);

    boolean isTriggered();
}
