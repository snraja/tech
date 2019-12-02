//
//  BaseViewModel.swift
//  News
//
//  Created by Narasimha Raja on 29/11/19.
//  Copyright © 2019 snraja. All rights reserved.
//

import UIKit

class BaseViewModel <Model : BaseModel> : ModelDelegate
{
    var delegate : ViewModelDelegate?
    
    init() {
    }
    
    // ModelDelegate
    func notifyModelUpdate(update: String) {
        // model updated, perform relevant changes
        fatalError("Did not override")
    }
}
