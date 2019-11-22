//
//  BaseController.swift
//  DP
//
//  Created by Narasimha Raja on 07/11/19.
//  Copyright © 2019 Narasimha Raja. All rights reserved.
//

import Foundation
import UIKit

class BaseController <TView, TModel> : ModelToControllerProtocol, ViewToControllerProtocol
                    where TView : BaseView , TModel : BaseModel
{
    var updateViewDelegate : ControllerToViewProtocol?
    var updateModelDelegate : ControllerToModelProtocol?
    
    init() {
        
    }
    
    // updates from the View
    func handleViewAction(action: String) -> Void {
        
    }
    
    func viewDidLoadAsync() {
        fatalError("Did not override viewDidLoadAsync")
    }
    
    func viewWillAppearAsync() {
        fatalError("Did not override viewWillAppearAsync")
    }

    // Model has been updated...
    func modelUpdated(update: String) {
        fatalError("Did not implement modelUpdated")
    }
}
