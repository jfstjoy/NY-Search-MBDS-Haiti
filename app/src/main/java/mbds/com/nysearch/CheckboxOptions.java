package mbds.com.nysearch;

import android.support.annotation.IntDef;

/**
 * Created by Joel Felix St Joy on 02/16/18.
 */

public class CheckboxOptions {

    @IntDef(flag=true,
            value = {ARTS, FASHION, SPORTS} )
    public @interface CHOICES {}

    public static final int ARTS = 1;
    public static final int FASHION = 2;
    public static final int SPORTS = 3;


}
