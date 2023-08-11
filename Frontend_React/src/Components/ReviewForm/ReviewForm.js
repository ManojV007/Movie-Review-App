import React from 'react';
import { Form, Button } from 'react-bootstrap';

const ReviewForm = ({handleSubmit, revText, labelText, defaultValue}) => {
  return (
    <Form>
      <Form.Group className='mb-3' controlId='exampleForm.ControlTextarea1'>
        <Form.Label>{labelText}</Form.Label>
        <Form.Control ref={revText} as='textarea' rows={4} defaultValue={defaultValue} />
      </Form.Group>
      <button onClick={handleSubmit} variant='outline-info' >Submit</button>
    </Form>
  )
}

export default ReviewForm
