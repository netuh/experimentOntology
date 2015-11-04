/**
 */
package experimentOntology.operation.impl;

import experimentOntology.operation.Context;
import experimentOntology.operation.OperationPackage;

import experimentOntology.planning.Artifact;
import experimentOntology.planning.Instrument;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.impl.ContextImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link experimentOntology.operation.impl.ContextImpl#getInstruments <em>Instruments</em>}</li>
 *   <li>{@link experimentOntology.operation.impl.ContextImpl#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {
	/**
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> provided;

	/**
	 * The cached value of the '{@link #getInstruments() <em>Instruments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruments()
	 * @generated
	 * @ordered
	 */
	protected EList<Instrument> instruments;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> required;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getProvided() {
		if (provided == null) {
			provided = new EObjectResolvingEList<Artifact>(Artifact.class, this, OperationPackage.CONTEXT__PROVIDED);
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instrument> getInstruments() {
		if (instruments == null) {
			instruments = new EObjectResolvingEList<Instrument>(Instrument.class, this, OperationPackage.CONTEXT__INSTRUMENTS);
		}
		return instruments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getRequired() {
		if (required == null) {
			required = new EObjectResolvingEList<Artifact>(Artifact.class, this, OperationPackage.CONTEXT__REQUIRED);
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationPackage.CONTEXT__PROVIDED:
				return getProvided();
			case OperationPackage.CONTEXT__INSTRUMENTS:
				return getInstruments();
			case OperationPackage.CONTEXT__REQUIRED:
				return getRequired();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OperationPackage.CONTEXT__PROVIDED:
				getProvided().clear();
				getProvided().addAll((Collection<? extends Artifact>)newValue);
				return;
			case OperationPackage.CONTEXT__INSTRUMENTS:
				getInstruments().clear();
				getInstruments().addAll((Collection<? extends Instrument>)newValue);
				return;
			case OperationPackage.CONTEXT__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends Artifact>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OperationPackage.CONTEXT__PROVIDED:
				getProvided().clear();
				return;
			case OperationPackage.CONTEXT__INSTRUMENTS:
				getInstruments().clear();
				return;
			case OperationPackage.CONTEXT__REQUIRED:
				getRequired().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OperationPackage.CONTEXT__PROVIDED:
				return provided != null && !provided.isEmpty();
			case OperationPackage.CONTEXT__INSTRUMENTS:
				return instruments != null && !instruments.isEmpty();
			case OperationPackage.CONTEXT__REQUIRED:
				return required != null && !required.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
