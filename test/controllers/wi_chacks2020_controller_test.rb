require 'test_helper'

class WiChacks2020ControllerTest < ActionDispatch::IntegrationTest
  test "should get index" do
    get wi_chacks2020_index_url
    assert_response :success
  end

end
