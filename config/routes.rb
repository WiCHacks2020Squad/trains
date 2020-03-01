Rails.application.routes.draw do
  get 'wichacks2020/index'
  get 'wi_chacks2020/index'
  get 'welcome/index'

  root 'wichacks2020#index'
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
