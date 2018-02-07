import { TestBed, async } from '@angular/core/testing';

import { SignInPageComponent } from './sign-in-page.component';

describe('SignInPageComponent', () => {
    let component: SignInPageComponent;
    let fixture: ComponentFixture<SignInPageComponent>;
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        SignInPageComponent
      ],
    }).compileComponents();
  }));
  beforeEach(async(() => {
      fixture = TestBed.createComponent(SignInPageComponent);
      component = fixture.componentInstance;
      fixture.detectChanges();
    }));
  it('should be created', () => {
  expect(component).toBeTruthy();
  });
});
