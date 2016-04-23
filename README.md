# Parasect : A lazy way to invoke thrift method #

## How To ##

### 0x00 Generate Java Code ###

![Files](md/files.png)

```bash
::on  windowns:
thrift -gen java example.thrift
java -jar parasect.jar example.thrift
```

![output](md/output.png)  

### 0x01 Add Dependency  ###

```groovy
buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath 'me.tatarka:gradle-retrolambda:3.2.5'
    }
}

//apply plugin: 'com.android.application'
apply plugin: 'me.tatarka.retrolambda'

android {
//    compileSdkVersion 23
//    buildToolsVersion "23.0.3"
//
//    defaultConfig {
//        applicationId 'com.example.thrifttail'
//        minSdkVersion 15
//        targetSdkVersion 23
//        versionCode 1
//        versionName "1.0"
//    }
//    buildTypes {
//        release {
//            minifyEnabled false
//            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
//        }
//    }
//
//    lintOptions {
//        abortOnError false
//    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
//    productFlavors {}
}

dependencies {
//    compile fileTree(include: ['*.jar'], dir: 'libs')
//    testCompile 'junit:junit:4.12'
//    compile 'com.android.support:appcompat-v7:23.3.0'
    compile 'io.reactivex:rxandroid:1.1.0'
    // Because RxAndroid releases are few and far between, it is recommended you also
    // explicitly depend on RxJava's latest version for bug fixes and new features.
    compile 'io.reactivex:rxjava:1.1.3'
}
```  

### 0x02  Usage ###

```java
/**
 * Description : login presenter
 *
 * @author Ban on 4/21/2016.
 */
public class LoginPresenter implements LoginP {

    private final static String TAG = LoginPresenter.class.getSimpleName();
    private LoginV loginV;

    public LoginPresenter(LoginV loginV) {
        this.loginV = loginV;
    }

    @Override
    public void login(String host, int port, String username, String password) {
        RxThrift.ber4SerOne = new RxThrift.Builder(host, port);
        // TODO: 4/22/2016 show loading
        RxSerOne.login(username, password)
                .map(str -> {
                    // work thread
                    Log.d(TAG, "MAIN THREAD ? " + String.valueOf(Looper.myLooper() == Looper.getMainLooper()));
                    // TODO: 4/21/2016 save user info to config file
                    // TODO: 4/21/2016 save result json info to config file
                    return str;
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(str -> {
                    Log.d(TAG, str);
                    loginV.loginSuccess(str);
                }, throwable -> {
                    throwable.printStackTrace();
                    loginV.loginFailed(throwable.toString());
                });
    }
}
```
