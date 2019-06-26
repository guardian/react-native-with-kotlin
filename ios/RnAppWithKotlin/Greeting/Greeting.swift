//
//  Greeting.swift
//  RnAppWithKotlin
//
//  Created by Max Spencer on 26/06/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

import Foundation
import greeting

@objc(Greeting)
class Greeting: NSObject {
  @objc(getGreeting:)
  func getGreeting(_ callback: RCTResponseSenderBlock) -> Void {
    callback([GreetingKt.hello()])
  }
}
