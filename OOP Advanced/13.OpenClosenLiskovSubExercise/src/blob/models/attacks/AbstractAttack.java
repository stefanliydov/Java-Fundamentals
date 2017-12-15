package blob.models.attacks;

import blob.interfaces.Attack;
import blob.models.BlobImpl;

public abstract class AbstractAttack implements Attack {
    public abstract void execute(BlobImpl attacker, BlobImpl target);
}
