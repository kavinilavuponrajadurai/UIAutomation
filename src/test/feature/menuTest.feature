Feature: verify menu
  As a user
  I should get redirected appropriately

  @menu
  Scenario Outline:verify menu redirection
    Given I am on the Home page with url "https://www.johnlewis.com/" with title "John Lewis & Partners Home"
    When I click Menu option "<Menu>"
    Then I should get redirected to appropriate product page with heading "<Page Heading>"
    Examples:
      | Menu          | Page Heading  |
      | Home & Garden | Home & Garden |
      | Women         | Women         |
      | Baby & Kids   | Baby & Kids   |

  @submenu
  Scenario Outline: verify sub menu redirection

    Given I am on the Home page with url "https://www.johnlewis.com/" with title "John Lewis & Partners Home"
    When I click mouseover Menu "<Menu>"
    And I click on submenu option "<SubMenu>"
    Then I should get redirected to appropriate product page with heading "<Page Heading>"

    Examples:
      | Menu               | SubMenu           | Page Heading      |
      | Home & Garden      | Living Room       | Living Room       |
      | Home & Garden      | Dining Room       | Dining Room       |
      | Furniture & Lights | Sofas & Armchairs | Sofas & Armchairs |


      
