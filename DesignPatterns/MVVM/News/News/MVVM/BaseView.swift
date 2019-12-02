//
//  BaseView.swift
//  News
//
//  Created by Narasimha Raja on 29/11/19.
//  Copyright © 2019 snraja. All rights reserved.
//

import UIKit

class BaseView : UIViewController , ViewModelDelegate
{
    override func viewDidLoad()
    {
        super.viewDidLoad()
        
    }
    
    // ViewModelDelegate
    func notifyViewModelUpdate(update: String) {
        // View Model updated, perform relevant changes
        fatalError("Did not override")
    }

    
}
