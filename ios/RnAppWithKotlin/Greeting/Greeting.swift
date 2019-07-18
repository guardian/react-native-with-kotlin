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
  
  @objc(sendTestEvent)
  func sendTestEvent() -> Void {
    let dispatcher = OphanDispatcher(
      app: App(version: "0.1", family: "Test", os: "iOS", edition: Edition.uk),
      device: Device(name: "iPhone", manufacturer: "Apple"),
      deviceId: "testDevice",
      userId: "testUser",
      recordStore: MemoryRecordStore(),
      logger: SimpleLogger()
    )vfdgdfsafgfgdfafsgdavfaffagdsafdfgfdsgae
  }
}
