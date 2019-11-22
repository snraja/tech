//
//  HomeController.swift
//  DP
//
//  Created by Narasimha Raja on 08/11/19.
//  Copyright © 2019 Narasimha Raja. All rights reserved.
//

import Foundation
import UIKit

class HomeController<HView : HomeView, HModel : HomeModel> : BaseController<HomeView, HomeModel>
{
    public let view : HView
    public let model : HModel

    override init() {
        let storyBoard = UIStoryboard(name: "Main", bundle: nil)
        self.view = storyBoard.instantiateViewController(withIdentifier: "HomeView") as! HView
        self.model = HModel()
        super.init()
        self.view.viewActionDelegate = self;
        self.model.modelDelegate = self;
        super.updateViewDelegate = view
        super.updateModelDelegate = model
    }
    
    override func viewDidLoadAsync() {
        print("ViewDidLoadAsync")
    }
    
    override func viewWillAppearAsync() {
        print("ViewWillAppearAsync")
    }
}
