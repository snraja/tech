//
//  HomeView.swift
//  News
//
//  Created by Narasimha Raja on 02/12/19.
//  Copyright © 2019 snraja. All rights reserved.
//

import Foundation
import UIKit

class HomeView : BaseView
{
    var viewModel: HomeViewModel<HomeModel>
    
    @IBOutlet var textView : UITextView!
    
    
    required init?(coder: NSCoder) {
        viewModel = HomeViewModel()
        super.init(coder: coder)
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        self.viewModel.delegate = self;
        self.viewModel.fetchNews()
        print("HomeView viewDidLoad" )
    }
    
    override func notifyViewModelUpdate(update: String)
    {
        switch update
        {
            case "FetchedNews":
                self.textView.text = self.viewModel.news
            break
        default:
            break
        }
    }
}
