# &lt;pager-pages&gt;

**&lt;pager-pages&gt;** is a Polymer web element to display an ergonomic pagination designed to take the same width during the whole navigation for a given amount of pages

## Build the Webjar

It is possible to build the project so that you end up with a working Webjar that you can include as Maven dependency. For this, you will need to build and publish the artifact to your local repository. Currently, the only available build tool configuration is for **[SBT](http://www.scala-sbt.org/)**.

## Usage

First of all, you will have to include polymer and the paper-button element:

```html
<link rel="import" href="/paper-elements/polymer/polymer.html">
<link href="/paper-elements/paper-button/paper-button.html" rel="import">
```

Then, you are ready to use this component using the following syntax

```html
<pager-pages href="YOUR_LINK_TO_FIRST_PAGE" current="CURRENT_PAGE" items-amount="TOTAL_AMOUNT_OF_ITEMS" items-per-page="AMOUNT_OF_ITEMS_PER_PAGE"></pager-pages>
```

Currently, the link provided through **YOUR_LINK_TO_FIRST_PAGE** should end by a query parameter corresponding to a page number.

## Options

`current-window-size` allow you to tune the number of pages to display around each side of the current page.

`boundary-window-size` allow you to tune the number of pages to display next to each boundary page.
