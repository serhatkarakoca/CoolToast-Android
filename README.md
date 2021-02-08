# CoolToast-Android
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=21)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/serhatkarakoca/CoolToast-Android.svg)](https://jitpack.io/#serhatkarakoca/CoolToast-Android)
<a href="https://www.linkedin.com/in/serhatkarakoca/">
    <img src="https://img.shields.io/badge/Support-Recommend%20me%20on%20Linkedin-yellow?style=for-the-badge&logo=linkedin" alt="Recommend me on LinkedIn" /></a>
    
## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.serhatkarakoca:CoolToast-Android:0.1.0'
}
```
## Usage

Each method always returns a `Toast` object, so you can customize the Toast much more. **DON'T FORGET THE `show()` METHOD!**

To display an default Toast:

``` java
CoolToast.makeText(this,"Hello World !",CoolToast.DEFAULT,CoolToast.LENGTH_LONG)
```
To display a success Toast:

``` java
CoolToast.makeText(this,"Hello World !",CoolToast.SUCCESS,CoolToast.LENGTH_LONG)
```
To display an info Toast:

``` java
CoolToast.makeText(this,"Hello World !",CoolToast.INFO,CoolToast.LENGTH_LONG)
```
To display a warning Toast:

``` java
CoolToast.makeText(this,"Hello World !",CoolToast.WARNING,CoolToast.LENGTH_LONG)
```
To display the error Toast:

``` java
CoolToast.makeText(this,"Hello World !",CoolToast.ERROR,CoolToast.LENGTH_LONG)
```
To display the confusing Toast:

``` java
CoolToast.makeText(this,"Hello World !",CoolToast.CONFUSING,CoolToast.LENGTH_LONG)
```
To display the reminder Toast:
``` java
CoolToast.makeText(this,"Hello World !",CoolToast.REMINDER,CoolToast.LENGTH_LONG)
```

You can also create your custom Toasts with passing your icon and background color:
``` java
CoolToast.makeText(this, "Custom Toast Message", resources.getColor(R.color.black), R.drawable.ic_baseline_info,CoolToast.LENGTH_SHORT).show()
```

## Screenshots

**Please click the image below to enlarge.**


<img src="https://raw.githubusercontent.com/serhatkarakoca/CoolToast-Android/master/CoolToast.jpg">


## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/serhatkarakoca/CoolToast-Android/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

### Contact - Let's become friend
- [Github](https://github.com/serhatkarakoca)
- [Linkedin](https://www.linkedin.com/in/serhatkarakoca/)
- [Facebook](https://www.facebook.com/3serhat3)

<p>
Don't forget to star ⭐ the repo it motivates me to share more open source
</p>


## License
  * [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2021 Serhat Karakoca

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
    
