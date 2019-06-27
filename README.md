# React Native with Kotlin Native

## Overview

This is a "hello world" example of a React Native application which includes a
["native module"](https://facebook.github.io/react-native/docs/native-modules-setup) (`NativeModules.Greeting`) which
is implemented using [Kotlin multiplatform](https://kotlinlang.org/docs/tutorials/native/mpp-ios-android.html). The
`Greeting` module requires some Java/Swift glue code to export its interface in the way React Native requires, but the
idea here is to minimise that glue code and to be able to keep all the business logic in one place, in the Kotlin
module.

The commits from 948ff89 to 3ff1dda should roughly demonstrate the process I went through to create this example in a
step-by-step fashion.

### Diagram

```
                           Android glue code
                         ↗                   ↘ 
"greeting" Kotlin module                       "Greeting" native module → React Native JS code
                         ↘                   ↗
                             iOS glue code
                        
```



* [`greeting` Kotlin module](https://github.com/guardian/react-native-with-kotlin/tree/master/greeting)
* [Android glue code](https://github.com/guardian/react-native-with-kotlin/tree/master/android/app/src/main/java/com/rnappwithkotlin/greeting)
* [iOS glue code](https://github.com/guardian/react-native-with-kotlin/tree/master/ios/RnAppWithKotlin/Greeting)
* [Usage in React Native JS code](https://github.com/guardian/react-native-with-kotlin/blob/master/App.js)

## Use cases

1. Creating native modules that require shared Android/iOS business logic.
2. Creating native modules using pre-existing Kotlin modules.
3. Sharing code between fully native Android/iOS apps and React Native apps.
