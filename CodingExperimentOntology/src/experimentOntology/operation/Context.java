/**
 */
package experimentOntology.operation;

import experimentOntology.planning.Artifact;
import experimentOntology.planning.Instrument;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.Context#getProvided <em>Provided</em>}</li>
 *   <li>{@link experimentOntology.operation.Context#getInstruments <em>Instruments</em>}</li>
 *   <li>{@link experimentOntology.operation.Context#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see experimentOntology.operation.OperationPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link experimentOntology.planning.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see experimentOntology.operation.OperationPackage#getContext_Provided()
	 * @model
	 * @generated
	 */
	EList<Artifact> getProvided();

	/**
	 * Returns the value of the '<em><b>Instruments</b></em>' reference list.
	 * The list contents are of type {@link experimentOntology.planning.Instrument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruments</em>' reference list.
	 * @see experimentOntology.operation.OperationPackage#getContext_Instruments()
	 * @model
	 * @generated
	 */
	EList<Instrument> getInstruments();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link experimentOntology.planning.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see experimentOntology.operation.OperationPackage#getContext_Required()
	 * @model
	 * @generated
	 */
	EList<Artifact> getRequired();

} // Context
