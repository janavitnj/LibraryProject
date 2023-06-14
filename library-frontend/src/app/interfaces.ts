export interface Book {
    bookId?: number,
    bookName: string,
    plagPer: number,
    authorId: number,
    managerId: number
}

export interface Author {
    authorId: number,
    authorName: string,
    email: string,
    books: Book[],
    students: Student[]
}

export interface Student {
    name: string,
    id: number,
    appointmentDate: string,
    email: string
}


export interface Appointment {
    studentId: number,
    authorId: number
}