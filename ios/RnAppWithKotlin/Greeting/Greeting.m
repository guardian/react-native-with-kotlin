//
//  Greeting.m
//  RnAppWithKotlin
//
//  Created by Max Spencer on 25/06/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <greeting/greeting.h>
#import "Greeting.h"

@implementation Greeting

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(getGreeting: (RCTResponseSenderBlock)callback){
  callback(@[[GreetingGreetingKt hello]]);
}

@end
