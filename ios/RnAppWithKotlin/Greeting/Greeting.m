//
//  Greeting.m
//  RnAppWithKotlin
//
//  Created by Max Spencer on 25/06/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(Greeting, NSObject)

RCT_EXTERN_METHOD(getGreeting: (RCTResponseSenderBlock)callback)

RCT_EXTERN_METHOD(sendTestEvent)

@end
