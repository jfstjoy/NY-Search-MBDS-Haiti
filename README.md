# nytimes-app - MBDS
***************************************************************************************************************
***************************************************************************************************************
## User Stories

The following **required** functionality is completed:

* [x] User can **scroll down to see more articles**. The maximum number of articles is limited by the API search.
* [x] User can click on "settings" which allows selection of **advanced search options** to filter results
* [x] Sort order (oldest or newest)
* [x] User can **search for news article** by specifying a query and launching a search. Search displays a grid of image results from the New York Times Search API.
* [x] Subsequent searches have any filters applied to the search results
* [x] User can configure advanced search filters such as:
* [x] Begin Date (using a date picker)
* [x] News desk values (Arts, Fashion & Style, Sports)
* [x] User can tap on any image in results to see the full text of article **full-screen**

***************************************************************************************************************
Optional features implemented:

* [x] Replaced Filter Settings Activity with a lightweight modal overlay
* [x] Used the **ActionBar SearchView** or custom layout as the query box instead of an EditText
* [x] Improved the user interface and experiment with image assets and/or styling and coloring
* [x] User can **share an article link** to their friends or email it to themselves
* [x] Implements robust error handling.
***************************************************************************************************************

Bonus features implemented:

* [x] For different news articles that only have text or only have images, use [Heterogenous Layouts](http://guides.codepath.com/android/Heterogenous-Layouts-inside-RecyclerView) with RecyclerView
* [x] Leverage the popular [GSON library](http://guides.codepath.com/android/Using-Android-Async-Http-Client#decoding-with-gson-library) to streamline the parsing of JSON data.
* [x] Use the [RecyclerView](http://guides.codepath.com/android/Using-the-RecyclerView) with the `StaggeredGridLayoutManager` to display improve the grid of image results
* [x] Apply the popular [Butterknife annotation library](http://guides.codepath.com/android/Reducing-View-Boilerplate-with-Butterknife) to reduce view boilerplate.

