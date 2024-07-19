package com.jminsure.pic2evalai.bridgenative;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "BridgeNative")
public class BridgeNativePlugin extends Plugin {

    private BridgeNative implementation = new BridgeNative();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        if (value == null) {
            call.reject("Message is required");
            return;
        }

        implementation.sendMessage(getContext(), value);

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }
}
