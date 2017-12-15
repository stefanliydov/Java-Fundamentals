package blob.models.attacks;

import blob.models.BlobImpl;

public class PutridFart extends AbstractAttack {

    @Override
    public void execute(BlobImpl source, BlobImpl target) {
        target.respond(source.getDamage());
    }
}
