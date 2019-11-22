//
//  ViewActionDelegate.swift
//  DP
//
//  Created by Narasimha Raja on 09/11/19.
//  Copyright © 2019 Narasimha Raja. All rights reserved.
//

import Foundation

protocol ViewToControllerProtocol
{
    func handleViewAction(action: String) -> Void
    func viewDidLoadAsync() -> Void
    func viewWillAppearAsync() -> Void
}
