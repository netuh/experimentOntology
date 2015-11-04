/**
 */
package codingExperimentOntology.variables.impl;

import codingExperimentOntology.apparatus.Questionnaire;

import codingExperimentOntology.variables.AwnserBasedVariable;
import codingExperimentOntology.variables.NewPackage1Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Awnser Based Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.variables.impl.AwnserBasedVariableImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwnserBasedVariableImpl extends TimeBoundVariableImpl implements AwnserBasedVariable {
	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected EList<Questionnaire> questionnaire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AwnserBasedVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage1Package.Literals.AWNSER_BASED_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Questionnaire> getQuestionnaire() {
		if (questionnaire == null) {
			questionnaire = new EObjectResolvingEList<Questionnaire>(Questionnaire.class, this, NewPackage1Package.AWNSER_BASED_VARIABLE__QUESTIONNAIRE);
		}
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewPackage1Package.AWNSER_BASED_VARIABLE__QUESTIONNAIRE:
				return getQuestionnaire();
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
			case NewPackage1Package.AWNSER_BASED_VARIABLE__QUESTIONNAIRE:
				getQuestionnaire().clear();
				getQuestionnaire().addAll((Collection<? extends Questionnaire>)newValue);
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
			case NewPackage1Package.AWNSER_BASED_VARIABLE__QUESTIONNAIRE:
				getQuestionnaire().clear();
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
			case NewPackage1Package.AWNSER_BASED_VARIABLE__QUESTIONNAIRE:
				return questionnaire != null && !questionnaire.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AwnserBasedVariableImpl
