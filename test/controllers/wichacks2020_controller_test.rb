require 'test_helper'

class Wichacks2020ControllerTest < ActionDispatch::IntegrationTest
  test "should get index" do
    get wichacks2020_index_url
    assert_response :success
  end

end
