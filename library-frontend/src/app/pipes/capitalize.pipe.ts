import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'Capitalize'
})
export class CapitalizePipe implements PipeTransform {

  transform(value: string): unknown {
    return value.charAt(0).toUpperCase() + value.slice(1);
  }

}
