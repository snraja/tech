//
//  ModelDelegate.swift
//  News
//
//  Created by Narasimha Raja on 02/12/19.
//  Copyright © 2019 snraja. All rights reserved.
//

import Foundation


protocol ModelDelegate {
    func notifyModelUpdate(update:String) -> Void
}
