package cordova-plugin-callwebview;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class CallWebView extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        // if (action.equals("coolMethod")) {
        //     String message = args.getString(0);
        //     this.coolMethod(message, callbackContext);
        //     return true;
        // }
        // return false;
        if (action.equals("add")) {
            this.add(args,callbackContext);
            return true;
        } else if (action.equals("sub")) {
            this.sub(args,callbackContext);
            return true;
        }
        return false;
    }

    // private void coolMethod(String message, CallbackContext callbackContext) {
    //     if (message != null && message.length() > 0) {
    //         callbackContext.success(message);
    //     } else {
    //         callbackContext.error("Expected one non-empty string argument.");
    //     }
    // }

    // new

    private void add(JSONArray args, CallbackContext callback )
    {
        if(args != null)
        {
            try {
                int p1 = Integer.parInt(args.getJSONObject(0).getString("paream1"));
                int p2 = Integer.parInt(args.getJSONObject(0).getString("paream2"));

                callback.success("" + (p1+p2));

            } catch (Expection ex)
            {
                callback.error("Something went wrong  " + ex)
            }
        } else {
            callback.error("please do not pass null value")
        }
    }

    private void sub(JSONArray args, CallbackContext callback )
    {
        if(args != null)
        {
            try {
                int p1 = Integer.parInt(args.getJSONObject(0).getString("paream1"));
                int p2 = Integer.parInt(args.getJSONObject(0).getString("paream2"));

                callback.success("" + (p1-p2));

            } catch (Expection ex)
            {
                callback.error("Something went wrong  " + ex)
            }
        } else {
            callback.error("please do not pass null value")
        }
    }
}
