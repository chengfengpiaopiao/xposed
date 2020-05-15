package www.yilian.com.xposed;

import android.util.Log;

import java.lang.reflect.Method;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class HookLogic implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {

        XposedBridge.log("HookLogic >> current package:" + lpparam.packageName);

        if("www.yilian.com.xposed".equalsIgnoreCase(lpparam.packageName)){
            XposedHelpers.findAndHookMethod("www.yilian.com.xposed.MainActivity", lpparam.classLoader,"getContent", new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    return "大家好，我被Hook了";
                }
            });
        }

    }

}