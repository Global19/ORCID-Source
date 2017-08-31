import 'reflect-metadata';

//Angular imports
import { BrowserModule } from "@angular/platform-browser";
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { Component, NgModule } from '@angular/core';
import { HttpModule, JsonpModule, Request, XSRFStrategy } from '@angular/http';
import { FormsModule }   from '@angular/forms'; // <-- NgModel lives here
import { RouterModule, UrlHandlingStrategy } from '@angular/router';
import { UpgradeModule } from '@angular/upgrade/static';

//User generated modules imports
import { BiographyNg2Module } from './biography/biography.ts';
import { CountryNg2Module } from './country/country.ts';
import { WidgetNg2Module } from './widget/widget.ts';
import { WorksPrivacyPreferencesNg2Module } from './worksPrivacyPreferences/worksPrivacyPreferences.ts';

// This URL handling strategy is custom and application-specific.
// Using it we can tell the Angular 2 router to handle only URL starting with settings.
export class Ng1Ng2UrlHandlingStrategy implements UrlHandlingStrategy {
    shouldProcessUrl(url) { 
        return url;
    }
    extract(url) { 
        return url; 
    }
    merge(url, whole) { 
        return url; 
    }
}

@Component(
    {
        selector: 'root-cmp',
        template: '<div class="ng-view"></div>'
    }
) 
export class RootCmp {
}

export class MetaXSRFStrategy implements XSRFStrategy {
    constructor(

    ) { }

  configureRequest(req: Request): void {
    var token = document.querySelector("meta[name='_csrf']").getAttribute("content");
    var header = document.querySelector("meta[name='_csrf_header']").getAttribute("content");
    if (token && header) {
      req.headers.set(header, token);
    }
  }
}

@NgModule({
    bootstrap: [
        RootCmp
    ],
    declarations: [
        RootCmp
    ],
    imports: [
        BiographyNg2Module,
        BrowserModule,
        CountryNg2Module,
        FormsModule,
        HttpModule,
        JsonpModule,
        UpgradeModule,
        WidgetNg2Module,
        WorksPrivacyPreferencesNg2Module
    ],
    providers: [
        { 
            provide: UrlHandlingStrategy, 
            useClass: Ng1Ng2UrlHandlingStrategy 
        },
        { 
            provide: XSRFStrategy, 
            useClass: MetaXSRFStrategy

        },

    ],

})

export class Ng2AppModule {
    constructor( public upgrade: UpgradeModule ){}
}