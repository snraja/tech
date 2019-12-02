//
//  ViewModelDelegate.swift
//  News
//
//  Created by Narasimha Raja on 02/12/19.
//  Copyright © 2019 snraja. All rights reserved.
//

import Foundation

protocol ViewModelDelegate
{
    func notifyViewModelUpdate(update:String) -> Void
}
